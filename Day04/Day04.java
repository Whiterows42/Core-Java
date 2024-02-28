package Day04;


public class Day04 {
	int id;
	String name;
	String cName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day04 d = new Day04();
		
		d.id = 1;
		d.name = "Ajit";
		d.cName = "Google";
		
		
		Day04 d2 = new Day04();
		
		d2.id = 2;
		d2.name = "Sahil";
		d2.cName = "Google"; // here extra memory are used 
		
		String container = d2.cName;
		System.out.println(container);
	}

}

