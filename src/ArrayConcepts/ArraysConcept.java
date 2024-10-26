package ArrayConcepts;

public class ArraysConcept {

	public static void main(String[] args) {

		// array: non primitive data types
		// it will hold only similar types of data

		// limitations of array:
		// 1. size is fixed: static array: to overcome this issue, we have to use
		// dynamic arrays: ArrayList(Collections)
		// 2. stores only similar types of data:

		// 1. new keyword
		// 2. array literals

		// int array: new keyword:
		int i[] = new int[4];// 0-3
		// i[-1] = 5;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4] = 50;//AIOB

		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		// System.out.println(i[-1]);//AIOB

		System.out.println("Li = " + 0);
		int len = i.length;
		System.out.println("Length = " + len);
		System.out.println("Hi = " + (len - 1));

		int j[] = new int[5];// 0-4
		j[1] = 100;
		System.out.println(j[0]);// 0
		System.out.println(j[1]);// 100
		System.out.println(j[3]);// 0
		// System.out.println(j[5]);

		System.out.println("Li = " + 0);
		int len1 = j.length;
		System.out.println("Length = " + len1);
		System.out.println("Hi = " + (len1 - 1));

		System.out.println("-------");

		// 0: segements = 0
		// -1: NegativeArraySizeException
		int k[] = new int[0];
		System.out.println("Li = " + 0);
		int len2 = k.length;
		System.out.println("Length = " + len2);
		System.out.println("Hi = " + (len2 - 1));

		System.out.println("-------");

		byte b[] = new byte[3];// 0-2
		b[0] = 10;
		b[1] = 30;
		b[2] = 40;

		System.out.println("-------");

		float fl[] = new float[2];// 0-1
		fl[0] = 12.33f;
		System.out.println(fl[0]);
		System.out.println(fl[1]);

		System.out.println("-------");

		char ch[] = new char[4];// 0-3
		ch[0] = '0';
		ch[1] = 'A';
		ch[2] = '1';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[3]);// space

		System.out.println("-------");

		boolean flag[] = new boolean[2];// 0-1
		flag[0] = true;
		System.out.println(flag[0]);
		System.out.println(flag[1]);

		// default values:
		// integer: 0
		// float/double: 0.0
		// char: space
		// boolean: false

	}

}