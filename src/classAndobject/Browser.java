package classAndobject;

public class Browser {
	String name;
	double version;
	String logo;
	String vendor;
	
	

	public static void main(String[] args) {

		Browser b1 = new Browser();
		b1.name = "chrome";
		b1.version = 120.11;
		b1.logo = "chrome.png";
		b1.vendor = "Google";
		
		
		Browser b2 = new Browser();
		b2.name = "firefox";
		b2.version = 121.22;
		System.out.println(b2.logo);

		
		b2 = b1;
		
		System.out.println(b2.name);
		System.out.println(b2.logo);

		
		
	}

}