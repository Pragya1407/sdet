package JavaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		
		//Use the Car keyword to declare Car Object
		Car Zoomcar = new Car();  //create object of class Car
		Zoomcar.make = 2014;      //initialize variables 
		Zoomcar.color = "Black";
		Zoomcar.transmission = "Manual";
		
		Zoomcar.displaycharacteristics();
		Zoomcar.accelarate();
		Zoomcar.brake();
	}
    
}
