package ArrayConcepts;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {

		int i[] = new int[10];// 0-9
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[9] = 50;

		System.out.println(i.length);

		System.out.println(i);// [I@c2e1f26

		// print the array:
		System.out.println(Arrays.toString(i));

		System.out.println("--------------");

		int t[] = new int[4];// 0-3
		t[0] = 100;
		t[1] = 200;
		t[2] = 300;
		t[3] = 400;

		System.out.println(Arrays.toString(t));// view of the array

		// print the values of array using loop:
		for (int k = 0; k <= t.length - 1; k++) {
			System.out.println(t[k]);// 100 200 300 400
			if (t[k] == 200) {
				System.out.println("hiii");
				break;
			}
		}

		System.out.println("-----------");

		// String array:
		String browser[] = new String[4];// 0-3
		browser[3] = "ie";
		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "edge";
		browser[2] = "safari";

		System.out.println(Arrays.toString(browser));// view of the array

		for (int e = 0; e <= browser.length - 1; e++) {
			System.out.println(browser[e]);

			if (browser[e].equals("edge")) {
				System.out.println("launch edge");
				break;
			}
		}

	}

}