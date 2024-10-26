package classAndobject;

public class Car {
	String name;
	int price;
	String model;
	public static final int wheels = 4;// objects will never hold the static property

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.model = "x3";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.model = "q3";
		

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.model = "city";

		
		System.out.println(c1.name + " " + c1.price + " "+ c1.model + " "+ Car.wheels);
		System.out.println(c2.name + " " + c2.price + " "+ c2.model + " "+ Car.wheels);
		System.out.println(c3.name + " " + c3.price + " "+ c3.model + " "+ Car.wheels);
		
		//access static variables:
		//1. using the class name:
		System.out.println(Car.wheels);
		
		//2. can access directly within the class:
		System.out.println(wheels);

		//3.can access static var using the object ref name?
		System.out.println(c1.wheels);//wheels should be accessed in a static way
		
		//Car.wheels = 5;
		
		System.out.println(c1.name + " " + c1.price + " "+ c1.model + " "+ Car.wheels);
		System.out.println(c2.name + " " + c2.price + " "+ c2.model + " "+ Car.wheels);
		
		
	}

}