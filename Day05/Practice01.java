package Day05;

public class Practice01 {
	
	static int x = 10;
public static void main(String[] args) {
	//problem with direct access of static vairable 
		System.out.println(x); // here is output is 10 
		int x  =4; // this is local varible so there is chance in main mathod have same varibel 
		// of static vairable  so we access static varible by class object
		
		
		System.out.println(x); // output is 4
		
		// right way of access static vairable
		System.out.println(Practice01.x); // this is correct way
}
}
