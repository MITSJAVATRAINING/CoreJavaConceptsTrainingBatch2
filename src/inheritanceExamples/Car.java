package inheritanceExamples;

public class Car extends Automobile{
	public void display() {
		System.out.println("This is bike " + this.engineName);
	}
	
	public static void main(String args[]) {
		//Automobile automobile = new Automobile();
		Car  car = new Car();
		car.setFuel("Petrol");
		car.setEngine("Suzuki");
		car.display();
	}
}
