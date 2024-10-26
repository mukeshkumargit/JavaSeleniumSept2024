package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		// cross browser logic:
		String browser = "chrome";

		switch (browser) {

		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("plz pass the right browser..." + browser);
			break;

		case "opera":
			System.out.println("launch opera");
			break;

		case "brave":
			System.out.println("launch brave");
			break;
		}

		// byte, short, int, String
		int marks = 90;

		switch (marks) {
		case 90:
			break;

		default:
			break;
		}
//		
//		
//		//long, double, float: NA
//		float num = 10.12f;
//		switch (num) {
//		case 1:
//			
//			break;
//
//		default:
//			break;
//		}

		// boolean: NA
//		boolean flag = true;
//		switch (flag) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		// char:
		char gender = 'm';
		switch (gender) {
		case 'm':
			System.out.println("male");
			break;
		case 'f':
			System.out.println("female");
			break;
		default:
			System.out.println("no gender found...");
			break;
		}

		// use cases:
		// 1. cross browser logic:
		// 2. USer ROLE: RBAC: admin, seller, partner, vendor, customer
		// 3. env: dev, qa, stage, ust, prod
		// 4. payment: CC, UPI, Paypal, Stripe
		// 5. language:
		// 6. loan type:
		// 7. Uber: car type: sedan, mini, premium
		// 10. OS logic: mac, linux, unix, windows

	}

}