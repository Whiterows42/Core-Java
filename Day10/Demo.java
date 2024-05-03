package Day10;


public class Demo {
static int id ;
static String name;
static int sal;

public static void main(String[] args) {

	Employee e = new Employee();
	e.id = 101;
	e.name = "ajit";
	e.sal = 1001;
	
	Demo.id = e.id;
	Demo.name = e.name;
	e.sal = Demo.sal;
	
	int id = Demo.id;
	String name =Demo.name;
	int sal = Demo.sal;
	System.out.println(id);
	System.out.println(name);
	System.out.println(sal);
}
}
