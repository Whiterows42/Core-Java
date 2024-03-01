package Day06;

public class Practice01 {
	
	public static void add() {
		int a,b,c;
		a = 20;
		b = 50;
		c = a+b;
		System.out.println("addition is :" +c);
	}
	
	public static void sub() {
		int x,y,z;
		x = 30;
		y = 50;
		z = x-y;
		
		System.out.println("substraction is " +z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods
		// we use methods to reusable do not repeat same code
		
		Practice01.add();
		Practice01.sub();
		Practice01.add();
		
		// but we not defince new value for oprations so see in next practice
	}

}
