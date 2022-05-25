package practice;

public class Student {

	String name;
	double percentage;
	static String institue = "Velocity";

	public static void main(String[] args ) {
		System. out .println( "Create object for student 1" );
		Student studentObj1 = new Student();
		System. out .println( "B4 assinging the value or default values" );
		System. out .println( studentObj1 . name ); 
		System. out .println( studentObj1 . percentage );
		System. out .println(Student. institue ); 
		studentObj1 . name = "Deepu Neeta" ;
		studentObj1 . percentage = 36;
		System. out .println( "After assinging the value" );
		System. out .println( studentObj1 . name ); 
		System. out .println( studentObj1 . percentage ); 
		System. out .println(Student. institue ); 
		System. out .println( studentObj1 . institue );
		System. out .println( "for arpita" );
		Student studentObj2 = new Student();
		studentObj2 . name = "Arpita" ;
		studentObj2 . percentage = 35;
		System. out .println( studentObj2 . name );
		System. out .println( studentObj2 . percentage ); 
		System. out .println(Student. institue );
		System. out .println( studentObj2 . institue );
		System. out .println( "changing the value of static variables" );
		institue = "velocity" ;
		System. out .println(Student. institue );
		System. out .println( studentObj1 . institue );
		System. out .println( studentObj2 . institue );
		}

}


