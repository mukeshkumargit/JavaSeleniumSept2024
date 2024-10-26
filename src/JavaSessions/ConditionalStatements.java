package JavaSessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		System.out.println(10 < 5);
		System.out.println(10 == 10);// true

		// < > >= <= == !=

		int a = 20;
		if (a > 5) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}

		//
		if (true) {
			System.out.println("Hello!!");
		} else {// Dead code
			System.out.println("Bye!!");
		}

		//
		boolean flag = false;
		if (flag) {
			System.out.println("Hello Naveen");
		} else {
			System.out.println("Bye Naveen");
		}

		// nested if-if-if-else
		int marks = 40;
		if (marks >= 90) {// false
			System.out.println("grade A");
			if (marks >= 95) {// false
				System.out.println("grade A++");
				if (marks == 100) {
					System.out.println("eligible for scholarship");
				}
			} else {
				System.out.println("Bye");
			}
		} else {
			if (marks >= 70) {
				System.out.println("grade B");
			} else {
				System.out.println("FAIL");
			}
		}

		// if comparing two primitive data types: ==
		// if comparing two no primitive data types (String): .equals

		// if-if-if-if-else
		// performance issue:
		// last else will be executed
//		String browser = "ie";
//		
//		if(browser.equals("chrome")) {//true
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {//f
//			System.out.println("launch firefox");
//		}
//		if(browser.equals("edge")) {//f
//			System.out.println("launch edge");
//		}
//		if(browser.equals("ie")) {//f
//			System.out.println("launch ie");
//		}
//		else {
//			System.out.println("plz pass the right browser...." + browser);
//		}

		// performance issue:
		// if-elseif-elseif-elseif-else
		String browser = "naveen";

		if (browser.equals("chrome")) {// true
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("edge")) {
			System.out.println("launch edge");
		} else if (browser.equals("ie")) {
			System.out.println("launch ie");
		} else {
			System.out.println("plz pass the right browser...." + browser);
		}

	}

}