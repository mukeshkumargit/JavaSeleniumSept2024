package JavaSessions;

public class StringConcept {
	
	public static void main(String[] args) {

		//String: is a class: in-built
	
		
		String s = "Hello Selenium";//SCP -- HEAP
		System.out.println(s);
		
		System.out.println("Hello World");
		
		String s1 = "100";
		System.out.println(s1+20);//concantenation 
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";
		
		
		System.out.println(a+b);//300: additional
		System.out.println(a+x);//100Hello
		System.out.println(x+a);//Hello100
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		System.out.println(a+b+x+y+(a+b));//300HelloSelenium300
		
		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
		System.out.println("the sum is : " + (a+b));
		
		double d1 = 12.33;
		double d2 = 12.22;
		System.out.println(d1+d2);
		System.out.println(d1+d2+x+y);//24.55HelloSelenium
		System.out.println(x+y+d1+d2);//HelloSelenium12.3312.22
		System.out.println(x+y+d1+d2+a+b);//HelloSelenium12.3312.22100200
		
		System.out.println(a+b+d1+d2+x+y);//324.55HelloSelenium

		
		byte b1 = 10;
		System.out.println(b1+x);
		
		System.out.println("Hi this is naveen " + x + y + a + b);//Hi this is naveen HelloSelenium100200
		
		//a-z: 97-122
		//A-Z: 65-90
		//0-9: 48-57
		char ch = 'a';//97
		char bh = 'b';//98
		System.out.println(ch);//a
		System.out.println(x+ch);//Helloa
		
		System.out.println(ch+bh);//97+98=195
		System.out.println(ch-bh);//97-98=-1
		System.out.println(ch*bh);//97*98=9506
		
		System.out.println('A' + 'B');//65+66=131
		
		//0-9: 48-57
		char c1 = '0';
		char c2 = '1';
		System.out.println(c1+c2);//48+49=97
		
		System.out.println(' '+'a');//32+97=129

		System.out.println(ch+bh+x+y);//195HelloSelenium
		
		System.out.println('a'+0);//97
		System.out.println((byte)'a');//97
		
		System.out.println((char)97);//a
		
		System.out.println((char)400);//Ɛ
		
		System.out.println('0'+'a'+'A');//48+97+65=210
		System.out.println("Hello" + '0'+'a'+'A');//Hello0aA
		System.out.println("Hello" + ('0'+'a'+'A'));//Hello210

		
		System.out.println(c1+c2+a+b+x+y);//397HelloSelenium
		
		
		
	}

}
