package globalVariable;

public class StaticVariable {
	// a variable that is declared with static keyword in a class & not in a method
	// static variable declared within a class outside any method
	// it is created at a start of pgm & destroyed when execution ends

	// scope of static variable is throught the class

	static int x = 10;

	public static void main(String[] args) {

		System.out.println(x);

	}

}
