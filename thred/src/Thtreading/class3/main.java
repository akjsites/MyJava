public class ParkingGarage
{
     private int availableSpots;
     private final int MAX_SPOTS ;

     
     public ParkingGarage(int maxSpot)
     {
         this.availableSpots = maxSpot;
         this.MAX_SPOTS = maxSpot;
     }
     
     public synchronized void parkCar(String carName)
     {
         while(availableSpots ==0)
         {
             System.out.println(carName+" is waiting for Spot");
             try
             {
                 wait();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
                 Thread.currentThread().interrupt();
                 
             }
             
         }
         availableSpots--;
         System.out.println(carName+" parked. Available spots:"+this.availableSpots);
         notifyAll();
   
     }
     
     
     public synchronized void freeSpot(String carName)
     {
       
         while(availableSpots == MAX_SPOTS)
         {
             try
             {
                 wait();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
                 Thread.currentThread().interrupt();
             }
         }
             availableSpots++;
             
             System.out.println(carName+" left. Available spots:" +this.availableSpots);
              notifyAll();
         
         
     }

     public int getAvailableSpots() {
         return availableSpots;
     }

     public void setAvailableSpots(int availableSpots) {
         this.availableSpots = availableSpots;
     }
     
     
     
}




package car_parking;

public class Car implements Runnable
{
    private ParkingGarage garage;
    private String  carName;
     

    public Car(ParkingGarage garage, String carName)
    {
        super();
        this.garage = garage;
        this.carName = carName;
    }

    @Override
    public void run()
    {
   
        garage.parkCar(carName);
       
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
       
        garage.freeSpot(carName);
    }

}


package car_parking;

import java.util.Scanner;

public class CarParkingApp {

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Welcome to D-Mart Parking");
        Scanner sc = new Scanner(System.in);
        ParkingGarage garage = new ParkingGarage(5);
       
        Thread []threads = new Thread[7];
       
        //Initializing the Thread array
        for(int i=0; i<threads.length; i++)
        {
            System.out.println("Enter Car name :");
            String carName = sc.nextLine();
            threads[i] = new Thread(new Car(garage, carName));    
        }
       
       
        for(Thread t : threads)
        {
            t.start();
        }
       
        Thread.sleep(10000);
        System.out.println("Parking garage simulation is complete.");
       
       
       
       
       
       

    }

}