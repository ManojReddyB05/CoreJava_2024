package classesObjects;

public class Car {
	
	String colour;
	String model;
	int milage;
	int cost;
	
	public void startCar() {
		System.out.println(model+" Car started.");
	}
	public void stopCar() {
		System.out.println(model+" Car Stoped");
	}
	
	public void carDetails() {
		System.out.println("Colour of car is : "+colour);
		System.out.println("Model of car is : "+model);
		System.out.println("Milage of car is : "+milage);
		System.out.println("Cost of car is : "+cost);
	}
	public static void main(String[] args){
		Car tata = new Car();
		tata.colour = "Orange";
		tata.model = "Nexan";
		tata.milage = 20;
		tata.cost = 950000;
		tata.startCar();
		tata.stopCar();
		tata.carDetails();

	}
	

}
