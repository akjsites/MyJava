package carexc;

public class testClass {
	public static void go(String text1) throws carexc.stop
	{
		if(text1=="go") {
		throw new stop("Car not stalled.");
		}
	}
	public static void puncture(String text1) throws carexc.stop
	{
		if(text1=="puncture") {
		throw new stop("Car is punctured.");
		}
		else {
			System.out.println("Car not stall");
			}
	}
	public static void move(String text1) throws carexc.stop
	{
		if(text1=="move") {
		throw new stop("Car not punctured.");
		}
		else {
			System.out.println("Car not stall");
			}
	}
	public static void carheat(int text1) throws carexc.stop
	{
		if(text1>50) {
		throw new stop("Car is heated more than 50 degrees Celsius.");
		}
		else {
			System.out.println("Car temperature normal.");
			}
	}
	

}
































//Car Stopped Exception Test:
//Action: Invoke CarTest.stop("stop").
//Expected Output: Should throw CarStoppedException with message "Car stopped for some reason."
//
//Car Not Started Test:
//Action: Invoke CarTest.stop("go").
//Expected Output: Should print "Car not stalled."
//
//Car Puncture Exception Test:
//Action: Invoke CarTest.puncture("puncture").
//Expected Output: Should throw CarPunctureException with message "Car is punctured."
//
//Car Not Punctured Test:
//Action: Invoke CarTest.puncture("move").
//Expected Output: Should print "Car not punctured."
//
//Car Overheating Exception Test:
//Action: Invoke CarTest.carHeat(60).
//Expected Output: Should throw CarHeatException with message "Car is heated more than 50 degrees Celsius."
//
//Car Temperature Normal Test:
//Action: Invoke CarTest.carHeat(40).
//Expected Output: Should print "Car temperature normal."