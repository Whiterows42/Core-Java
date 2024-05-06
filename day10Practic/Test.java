package day10Practic;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Assigment2methods a = new Assigment2methods();
	Scanner sc = new  Scanner(System.in);
	System.out.println("enter integer value");
	int c = sc.nextInt();
	System.out.println("enter float value");
	float b = sc.nextFloat();
			
	a.m2(c, b);
	
	Assigment2methods.m3();
}
}
