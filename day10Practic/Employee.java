package day10Practic;

public class Employee {

	
	int age;
	String name;
	public Employee(int age, String name) {
		
		this.age = age;
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setter(String name, String lname) {
		String fullName = name + lname;
		System.out.println(fullName);
	}
}
