package classAndobject;

public class Truck {
	static int wheels = 4;

	public static void main(String[] args) {

		System.out.println(Truck.wheels);
		Truck.wheels = 5;

		System.out.println(Car.wheels);
		System.out.println(Truck.wheels);

	}

}