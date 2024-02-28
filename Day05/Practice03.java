package Day05;

public class Practice03 {
	static int mainAmmunt = 1000;
	
public static void main(String[] args) {
	
	int Transaction1 = 500;
	System.out.println( "Debited :" +Transaction1 +" from the " + Practice03.mainAmmunt);
	
	int avlB = Practice03.mainAmmunt - Transaction1;
	
	System.out.println("Avl Ballance is :" + avlB);
	
	fun(); // when it call and execute the reserved memory are clear of distroy 
	fun(); // then here for this fun the new memory allocated 
	
}
public static void fun() {
int a = 10; // local vairable are also private vairables
a = a+ 20;

System.out.println(a);
}
}
