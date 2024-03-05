package Day07;

public class Day07 {
	static int c;
	// the method with retunrn 
	public static int m1(int a , int b) {
		c = a +b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day07.m1(20, 10);
		 c = 100 + Day07.m1(20, 10);
		System.out.println(c);
	}

}
