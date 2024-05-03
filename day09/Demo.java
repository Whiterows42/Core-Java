package day09;

public class Demo {

	static String name = "sam";
	static int id = 101;
	static int sal = 1000;
	int one  = 10;
	int two = 20;
	public static void main(String[] args) {
		System.out.println(Demo.name);
		
		Demo d = new Demo();
		System.out.println(d.one +"  "+ d.two);
	}
}
