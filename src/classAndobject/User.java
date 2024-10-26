package classAndobject;

public class User {

	// class variables: global
	String name;
	int age;
	String city;
	boolean isActive;
	double salary;

	public static void main(String[] args) {

		// Human: category: template, blueprint: class
		// Objects

		// Vehicle: class: template: name, color, price, engine
		// Objects: BMW, Audi, Honda

		// Customer: Class: name, dob, age, city, phone, id
		// Objects: c1(naveen, 010101, 30, pune, 101)
		// Objects: c2(ravi, 010102, 31, pune, 102)

		// create the object of the user class: using new keyword
		User u1 = new User();
		// User: class
		// new User(): object
		// u1: object reference variable name

		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.isActive + " " + u1.salary);

		u1.name = "Tom";
		u1.age = 20;
		u1.city = "Pune";
		u1.isActive = true;
		u1.salary = 12.33;

		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.isActive + " " + u1.salary);

	}

}
