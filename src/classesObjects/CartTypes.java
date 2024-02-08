package classesObjects;

public class CartTypes extends Car{
	public static void main(String[] args) {
		Car tata = new Car();
		
		tata.colour = "Green";
		tata.model = "Harrier";
		tata.milage = 15;
		tata.cost = 1800000;
		
		tata.startCar();
		tata.stopCar();
		tata.carDetails();
		
		System.out.println("****************");
		
		Car maruthi = new Car();
		
		maruthi.colour = "White";
		maruthi.model = "Beleno";
		maruthi.milage = 20;
		maruthi.cost = 1100000;
		
		maruthi.startCar();
		maruthi.stopCar();
		maruthi.carDetails();
		
		System.out.println("****************");
		
		Car hyundai = new Car();
		
		hyundai.colour = "Red";
		hyundai.model = "Venue";
		hyundai.milage = 17;
		hyundai.cost = 1000000;
		
		hyundai.startCar();
		hyundai.stopCar();
		hyundai.carDetails();
		
		
	}

}
