package JavaSessions;

public class ForEachLoop {

	public static void main(String[] args) {

		int i[] = { 10, 20, 30, 40 };// 0-3

		// index loop:
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}

		System.out.println("---------");

		// for each loop:
		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("---------");

		//
		int p[] = new int[4];// 0-3
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		p[3] = 40;

		for (int naveen : p) {
			System.out.println(naveen);
		}

		System.out.println("---------");

		String browser[] = { "chrome", "firefox", "ie", "edge" };

		int c = browser.length - 1;
		for (String b : browser) {
			System.out.println(browser[c]);
			c--;
		}

		for (String br : browser) {
			System.out.println(br);
			if (br.equals("firefox")) {
				System.out.println("launch ff");
				break;
			}
		}

		//
		int m[] = { 10, 20, 30, 40 };// 0-3

		int count = m.length - 1;// 3
		for (int t : m) {
			t = count;// 3
			System.out.println(m[t]);// 40
			count--;
		}

		// wrong code
//		for(int t : m) {
//			System.out.println(t);
//			System.out.println(m[t]);
//			t--;
//		}
	}

}
