package classAndobject;

public class Employee {

	int empId;
	String name;
	int age;
	String deptName;
	boolean isPerm;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.empId = 100;
		e1.name = "Tom";

		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.deptName);
		e1.deptName = "HR";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.deptName);

		e1.name = "Tom Peter";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.deptName);

		//
		Employee e2 = new Employee();
		e2.empId = 200;
		System.out.println(e1.empId);
		System.out.println(e2.empId);

		// no ref object
		new Employee().empId = 300;
		new Employee().name = "Anu";

		// null ref object
		Employee e3 = new Employee();
		e3 = null;
		e3 = new Employee();
		e3.empId = 400;// NPE
		System.out.println(e3.empId);

		System.gc();// call the GC but there is no gurantee

	}

}