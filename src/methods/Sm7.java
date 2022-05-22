package methods;

public class Sm7 {
	// Instance variable in instance method
	// we can use instance variable directly inside instance method

	// instance variable

	int a = 20;

	// instance method

	public void method2() {

		System.out.println("this is instance type method");
		System.out.println("static variable in instance type methofd-" + a);
		// System.out.println("instance variable in instance method-" + b);
	}

	public static void main(String[] args) {

		// creationn of object

		Sm7 s = new Sm7();

		// calling of instance type of method

		s.method2();

	}

}
