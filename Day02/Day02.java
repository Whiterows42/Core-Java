package Day02;

public class Day02 {
	
	int day;
	String topic;
	String points;
	
	public static void main(String[] args) {
		Day02 obj = new Day02();
		obj.day = 1;
		obj.topic = "use of class keyword";
		obj.points = "1, class keyword is used to create \n userDefined Data types";
		System.out.println("\n");
		System.out.println(" Day -> " + obj.day + ", \n Topic -> " + obj.topic + ", \n Points -> " + obj.points);
		
		Day02 obj2 = new Day02();
		
		obj2.day = 1;
		obj2.topic = "2 , Memory Allocation";
		obj2.points = "Memory Allocated or Reserved When \n we create new object of class  \n in case of user define data tupes";
		System.out.println("\n");
		System.out.println(" Day -> " + obj2.day + ", \n Topic -> " + obj2.topic + ", \n Points -> " + obj2.points);

		Day02 obj3 = new Day02();
		
		obj3.day = 1;
		obj3.topic = "3, Memory Address";
		obj3.points = "java not support pointer her is concept \n of class refrence are used to store the memory addreess of object";
		System.out.println("\n");
		System.out.println(" Day -> "+obj3.day +", \n Topic -> " + obj3.topic +", \n Points -> "+ obj3.points  );
		
		Day02 obj4 = new Day02();

		obj4.day = 1;
		obj4.topic = "4, Updating Data in 	 Classes ";
		obj4.points = "When assigning a new value to an existing variable it overwrites the old value.\nThat's why we use a new reference of the class.";
		System.out.println("\n");
		System.out.println(" Day -> "+obj4.day +", \n Topic -> " + obj4.topic +", \n Points -> "+ obj4.points  );
	}

}
