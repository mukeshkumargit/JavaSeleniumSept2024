package JavaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		// TC - TimeComplexity
		// Big Oh
		// O(n)

		int i = 10;
		System.out.println(i);// 10
		int j = 20;

		// O(1): Constant Time

		// 10 mins: 0.000000001
		for (int k = 1; k <= 1000000; k++) {
			System.out.println(k);
		}

		// 1+n+n+n ==> 3n+1 (Linear Equation)
		// 3n+1 ==> 3n ==> n ==> O(n)

		int r = 1;// initialization
		while (r <= 10) {
			System.out.println(r);
			System.out.println("bye");
			r++;
		}
		// 1+n+n+n+n=>4n+1==>4n==> n ==> O(n)

		//

//		for (int i = 0; i <= 5; i++) {
//			for (int j = 0; j <= 5; j++) {
//				System.out.print(i + "" + j + " ");// 00 01 02 03 04 05
//			}
//			System.out.println();
//
//		}

		// (1+n+n+n)(1+n+n+n)=> (1+3n)(1+3n)=> 1+3n+3n+9n^2=> 9n^2+6n+1 (Quadratic
		// Equation)
		// 9n^2+6n+1 ==> 9n^2+6n ==> 3n(3n+2)==> 3n(3n)=> 9n^2 ==> n^2 ==> O(n^2)

		// execl data: row-column
		// matrix:
		// Object[][]:

//		for (int i = 0; i <= 5; i++) {
//
//			for (int j = 0; j <= 5; j++) {
//
//				for (int k = 0; k <= 5; k++) {
//
//					System.out.print(i + "" + j + ""+ k +" ");//000 001 002
//				}
//				
//				System.out.println();
//
//			}
//
//
//		}

		// cubic equaltion: (n) (n) (n) --> O(n^3)

		//
		for (int k = 1; k <= 1000000; k++) {
			System.out.println(k);
		}
		// n

		for (int k = 1; k <= 1000000; k++) {
			System.out.println(k);
		}
		// n
		// n+n=2n=>n => O(n)

		//
		// n
		// n/2
		// n/4
		// n/8

		// k = n/2
		// log k = log n/2
		// log k = log n - log 2
		// log k = log n
		// O(log n)

		// 60 --> 30 --> 15 --> 7 -- > 3 --> 1
		// 60 --> 1 to 60

		// k = n/2
		// log k = log n/2

		// binary search: log n (base 2)

	}

}
