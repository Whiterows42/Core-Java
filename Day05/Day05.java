package Day05;

public class Day05 {

	int a;
	String b;
	static String cname;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Day05 d = new Day05();
	d.a = 99;
	d.b = "ajit";
	d.cname = "tcs"; // no good way to access static vairable 
	
	System.out.println(Day05.cname); // so the static vairable no need to create class object by referece
	
	// here when i create class object the memory allocated to non Static vairable
	
	}

}
