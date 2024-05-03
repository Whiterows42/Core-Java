package day09;

public class Employee {
	
static int id;
static	String name;
static	int sal;
	
public static void main(String[] args) {
	
	Employee e = new Employee();
	e.id = 101;
	
	Employee e2 = new  Employee();
	e2.id = e.id;
	e2.id = 102;
	System.out.println(e2.id +" " + "" + e.id);
}
}
