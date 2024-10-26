package JavaSessions;

public class WideningAndNarrowingTypeCasting {
	
	public static void main(String[] args) {

		//-128 to 127 =>256
		byte b1 = 120;
		byte b2 = 110;
		
		int b3 = b1+b2;//230
		System.out.println(b3);
		
		short s1 = 1000;
		short s2 = 1500;
		int s3 = s1+s2;//2500
		System.out.println(s3);
		
		
		int i1 = 10000;
		int i2 = 20000;
		long i3 = i1+i2;
		
		
		byte bt = 90;
		short st = bt;
		System.out.println(st);
		
		short sr = 1999;
		int ir = sr;
		
		int it = 1000;
		long lt = it;
		
		long lu = 9999898;
		float fu = lu;
		System.out.println(fu);
		double du = lu;
		System.out.println(du);
		
		short dv = 1865;
		float fv = dv;
		
		byte bv = 90;
		short sc = bv;
		
		
		//
		short test = 200;
		byte best = (byte) test;//200
		System.out.println(best);//-56
		
		short sf = 50;
		byte bf = (byte)sf;//50
		System.out.println(bf);//50
		
		
		long lg = 500;
		byte bh = (byte)lg;//500
		System.out.println(bh);//-12
		
		long amount = 1500;
		int finalValue = (int) amount;//1500
		System.out.println(finalValue);
		
		float bmi = 12.59f;
		int ix = (int)bmi;
		System.out.println(ix);
		
		//12.33 , 200.22, 120.44, 900.44
		double ds = 900.44;
		byte bs = (byte) ds;//900
		System.out.println(bs);
		
		
		//chinese ---> 230
		char ct = 'A';//65
		int mt = ct;
		long mtl = ct;
		float mtf = ct;
		double mtd = ct;

		System.out.println(mt);//65
		System.out.println(mtf);//65

		//byte and short not allowed to store char
		
		
		long ss = 98888888776L;
		char cs = (char) ss;//988888-->
		System.out.println(cs);
		
		float fs = 99.0f;
		char cfs = (char) fs;//99.0-->99-->c
		System.out.println(cfs);
		
		
		byte ff = 127;
		int dff = ++ff;
		System.out.println(dff);
		
		
	}

}