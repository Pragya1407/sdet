package JavaActivity_1_1;

public class Activity_1_1_Car {
	String color; //adding properties to class
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Activity_1_1_Car() {
			tyres = 4; //initializing through constructor
			doors = 4;
		}
	public void displaycharacteristics() {     //adding method to class
    	System.out.println("Making year of car: "+ make);
    	System.out.println("Color of car: "+ color);
    	System.out.println("Transmission of car: " + transmission);
    	System.out.println("Number of doors: " + doors);
    	System.out.println("Number of tyres: " + tyres);
    }
	
	public void accelarate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car is stoped");
	}
}
