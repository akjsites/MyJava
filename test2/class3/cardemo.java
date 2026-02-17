package Thtreading.class3;

public class cardemo implements Runnable {

	   ParkingGarage garage;
	   String carName;
	   

	public cardemo(ParkingGarage garage) {
		super();
		this.garage = garage;
//		this.carName = carName;
	}


	@Override
	public void run() {
		try {
			String carName[]= {"audi","lamb","bmw","nexon","tata"};
			for(String name:carName)
			{
				garage.parkcar(name);
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
