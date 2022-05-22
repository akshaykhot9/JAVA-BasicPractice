package globalVariable;

public class StaticVariable3 {
	// rule no 3
	// Global-Static Variable

	// If static variable value change then new value will be overrite and shared
	// among the class members and objects
	// when static variable declared in a class its copy will share across the
	// member of class and also with objects

	// static variable

	static int x = 10;

	public static void main(String[] args) {

		System.out.println(x);

		// create object

		StaticVariable3 s = new StaticVariable3();

		System.out.println(s.x);

		x = 50;

		System.out.println(x);
		System.out.println(s.x);

	}

}
