package day09;

public class Test {
public static void main(String[] args) {
	Employee e = new Employee();
	e.id = Demo.id;
	e.name = Demo.name;
	e.sal = Demo.sal;
	
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.sal);
}
}
