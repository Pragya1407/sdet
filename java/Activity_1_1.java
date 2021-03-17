package JavaActivity_1_1;

public class Activity_1_1 {
		public static void main(String[] args) {
			
			//Use the Car keyword to declare Car Object
			Activity_1_1_Car Zoomcar = new Activity_1_1_Car();  //create object of class Car
			Zoomcar.make = 2014;      //initialize variables 
			Zoomcar.color = "Black";
			Zoomcar.transmission = "Manual";
			
			Zoomcar.displaycharacteristics();
			Zoomcar.accelarate();
			Zoomcar.brake();
		}
}
