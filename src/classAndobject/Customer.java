package classAndobject;

public class Customer {
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.name = "Anu";
		c1.age = 35;
		c1.city = "Pune";

		Customer c2 = new Customer();
		c2.name = "Ravi";
		c2.age = 40;
		c2.city = "Bangalore";

		Customer c3 = new Customer();
		c3.name = "Bikash";
		c3.age = 30;
		c3.city = "LA";

		System.out.println(c1.name + " " + c1.age + " " + c1.city);// A
		System.out.println(c2.name + " " + c2.age + " " + c2.city);// R
		System.out.println(c3.name + " " + c3.age + " " + c3.city);// B

		System.out.println("------------");

		c1 = c2;

		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);

		System.out.println("------------");

		c2 = c3;

		System.out.println(c1.name + " " + c1.age + " " + c1.city);// R
		System.out.println(c2.name + " " + c2.age + " " + c2.city);// B
		System.out.println(c3.name + " " + c3.age + " " + c3.city);// B

		System.out.println("------------");

		c3 = c1;

		System.out.println(c1.name + " " + c1.age + " " + c1.city);// R
		System.out.println(c2.name + " " + c2.age + " " + c2.city);// B
		System.out.println(c3.name + " " + c3.age + " " + c3.city);// R

	}

}