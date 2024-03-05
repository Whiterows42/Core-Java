package Day08;

import java.util.Scanner;

public class Day08 {

	public static void display(int id, String name, int sal) {
		// TODO Auto-generated method stub
		System.out.println("id is: " + id + " name is: " + name + " salarie is: " + sal);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		int id = sc.nextInt();

		System.out.println("enter Name of employee");
		String name = sc.next();

		System.out.println("Enter Sallary");
		int sal = sc.nextInt();

		Day08.display(id, name, sal);

		Emplaoyee x = new Emplaoyee();
		x.id = id;
		x.name = name;
		x.sal = sal;
		
		Day08.fun(x);
	}

	public static void fun(Emplaoyee e) {
		// TODO Auto-generated method stub
		System.out.println(e.id + " " + e.name + " " + e.sal);
		
	}
}
