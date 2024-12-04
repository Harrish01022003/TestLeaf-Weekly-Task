package week7.day1;

public class ChromeDriver {
	
	int a;
	String b;
	boolean c;
	//default constructor
	public ChromeDriver() {
		System.out.println("Learn Constructor");
	}
	public ChromeDriver(int a, String b, boolean c ) {
		//previous constructor should be called in another constructors first line
		this();
		//global var = local var
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	//constructor chaining
	//keyword  -  this
	//this - current class - var,method,constructor
	
	public static void main(String[] args) {
		ChromeDriver obj = new ChromeDriver();
		ChromeDriver obj1 = new ChromeDriver(7,"harrish",true);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
