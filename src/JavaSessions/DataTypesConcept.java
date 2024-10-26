package JavaSessions;

public class DataTypesConcept {
	
	//execution will start from here
	public static void main(String[] args) {

		//data types: strict type: data type is mandatory
		
		//1. primitive data types: no object creation and memory size is already fixed
		
		//1.a: Numeric Type:
			//1.a.1: Integral Value:
					//i: Integer: byte, short, int, long
					//ii: Floating-point: float, double
			//1.a.2: character: char a, b, A, 0, $, & 
		
		//1.b: boolean: true/false
				
		//2. non primitive data types: Object, class, Interface, Arrays, ArrayList, String
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 : -2^7 to 2^7-1
		byte b = 1;
		byte b1 = -90;
		byte b2 = 127;
		byte b3 = 0;
		
		byte n = 25;
		 n = 35;
		 System.out.println(n);
		 System.out.println(b);
		//age: 1 to 100
		
		//2. short:
		 //size: 2 bytes = 2x8 = 16 bits
		 //range: -32768 to 32767 : -2^15 to 2^15-1
		short sh = 1000;
		short sh1 = 28989;
		short h = 1;
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647: -2^31 to 2^31-1
		int i = 10;
		int total = 677656;
		int finalBillAmount = 90909090;
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range: -2^63 to 2^63-1
		long lg = 5656;
		long lh = 9898989887L;
		System.out.println(lh);

		//world population, distance bw planets, 
		//CC, mobile, SSN, Aadhar card: String
		//1212545465657676: String
		
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after . , you can take upto 6-7 digits
		float m = 12.33f;
		float m1 = (float)34.44;
		System.out.println(m);
		System.out.println(m1);
		
		float f3 = 90f;
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after . , you can take upto 15 digits
		double t1 = 12.333;
		double t2 = 0.999;
		
		double t3 = 100;
		System.out.println(t3);//100

		//6. char:
		//single digit value
		//size: 2 bytes = 16 bits
		//unicode : ASCII
		//a-z: 97-122
				//A-Z: 65-90
				//0-9: 48-57
		char ch = 'a'; //a-z
		char ch1 = 'A'; //A-Z
		char ch2 = '9'; //0-9
		char ch3 = '$';
		
		char gender = 'm';
		char test = ' ';
		
		//7. boolean: 
		//range: true/false
		//size: ~1 bit
		boolean flag = true;
		boolean nv = false;
		
		System.out.println(flag);
		System.out.println(nv);
		
		System.out.println(10 > 5);
		System.out.println(100);
		System.out.println(12.33f);
		
		
		//String: class: non primitive
				
		//user:
		//age: 1 to 500
		long age = 1; //64 bits x 1000 = 64000bits
		byte ag = 1;//8 bits x 1000 = 8000bits
		
		
		
	}

}
