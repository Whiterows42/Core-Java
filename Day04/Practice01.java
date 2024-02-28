package Day04;

public class Practice01 {
	
	int id ;
	String name;
	static String  cName = "Google"; // here we static the variable 
	
	// Static varaible are load first of main method  so memory allocated in run time
public static void main(String[] args) {
	
	Practice01 p = new Practice01();
	
	p.id = 1;
	p.name = "Ajit";
	System.out.println(cName);
}
}
