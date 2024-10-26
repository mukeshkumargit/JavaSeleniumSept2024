package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10:
		// 1. while loop:

		int i = 1;// initialization
		while (i <= 10) {
			System.out.println(i);// 12345678910
			i++;
			// ++i;
			// i=i+1;
		}

		System.out.println("------------");

		// 10 to 1:
		int e = 10;
		while (e >= 1) {
			System.out.println(e);// 10987654321
			e--;// 0
		}

		System.out.println("------------");

		//
		int r = 1;
		while (r >= 10) {// false
			System.out.println(r);
			r++;
		}
		System.out.println(r);

		System.out.println("------------");

		int j = 1;
		while (j <= 10) {
			System.out.println(j);// 1
			System.out.println("hi");
			break;
		}

		System.out.println("------------");

		int t = 1;
		while (t <= 10) {// T
			System.out.println(t);// 11111111111....111
			if (t == 5) {// F
				System.out.println("Bye!!");
				break;
			}
			t++;
		}

		System.out.println("------------");

		while (true) {
			System.out.println("welcome to Hotel Taj");
			break;
		}

		System.out.println("------------");

		// 2. for loops:
		// 1 to 10:

		for (int k = 1; k <= 10; k++) {
			System.out.println(k);// 123....910
		}

		System.out.println("------------");

		int h = 1;
		for (; h <= 10;) {
			System.out.println(h);
			h++;
		}

		System.out.println("------------");

		for (;;) {
			System.out.println("welcome to Naveen Automation Labs");
			break;
		}

		System.out.println("------after this....------");

		for (byte b = 1; b <= 10; b++) {
			System.out.println(b);
		}

		System.out.println("------------");

		for (double d = 1.2; d <= 5.5; d = d + 0.1) {
			System.out.println(d);// 1.2
		}

		System.out.println("------------");

		for (float f = 1.2f; f <= 5.5; f++) {
			System.out.println(f);
		}

		System.out.println("------------");
		// A-Z
		// a-z
		// 0-9
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (int) ch);// a = 97
		}

		System.out.println("------------");

		// 97 = a
		for (int dt = 97; dt <= 122; dt++) {
			System.out.println((char) dt);
		}

		System.out.println("------------");
		// 10 to 1:
		for (int l = 10; l >= 1; l--) {
			System.out.println(l);
		}
		// String rev = "selenium" --> muineles

		// use cases:
		// while loop: when number of iterations are not fixed
		// 1. facebook/linkedin/insta: infinite scrolling
		// 2. webtable pagination: < 1 2 3 4 ...n>
		// 3. waiting for the web element: 5 10 2 0
		// 4. waiting for the page loading: 5 10 15 20 40
		// 5. calendar handling
		// 6. retry for the failure test cases

		// for loop: when number of iterations are fixed
		// arrays, arraylist: [10] : 1 to 10
		// dropdown: country(233): static
		// month: 1 to 12:
		// redbus.in: 230 seats: 1 to 230
		// google search

		System.out.println("------------");

		// do-while:
		int p = 1;
		do {
			p++;// 2
			System.out.println(p);// 2
			if (p == 5) {
				System.out.println("bye!!");
				break;
			}

			break;
		} while (p <= 10);// T

		// use cases:
//		do {
//		//check the webelement already present on the page(button/link): 
		// click on it
		// break;
//		}
//		while(condition);

	}

}