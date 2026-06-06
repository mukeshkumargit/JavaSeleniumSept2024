package ConstructorConcept;

public class Employee1 {
	
		String name;
		int age;
		String city;
		boolean isActive;
		double salary;

		// constructor:
		// name: will be same as class name
		// const.. is not a function (it looks like a function)
		// const.. can never have any return type, no void, no return keyword
		// const.. can have params
		// const.. will be called when you create the object but function will be called using obj reference variable
		//if the default const.. is not available in the class, then jvm will add one default hidden const.. in the class at the runtime
		//const... can be overloaded
		
		
		public Employee1() { //0 param
			System.out.println("default const... 0 param");
		}
		
		public Employee1(int a) { // 1 param
			System.out.println("const... 1 param " + a);
		}
		
		public Employee1(int a, int b) { // 2 param
			System.out.println("const... 2 params " + a+b);
		}
		
		public Employee1(String a, int b) { // 2 param
			System.out.println("const... 2 params " + a+b);
		}
		
		public Employee1(int a, String b) { // 2 param
			System.out.println("const... 2 params " + a+b);
		}

		public static void main(String[] args) {

			Employee1 e1 = new Employee1();
			Employee1 e2 = new Employee1(10);
			Employee1 e3 = new Employee1(10,20);
			Employee1 e4 = new Employee1(20, "selenium");

		}

	}