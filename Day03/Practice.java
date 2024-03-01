package Day03;

public class Practice {
	int a;
	short b;
	int e;
	long d;
	
public static void main(String[] args) {
	
	Practice p = new Practice();
	p.a = 20;
	p.b = (short) p.a;
	
	System.out.println(p.b);
}
}
