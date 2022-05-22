package methods;

public class Sm6 {
	// Variable with Instance Method
	// Static variable in instance method
	// we can use static variable directly inside the instance method

	static int a = 10; // static variable

	// instance method

	public void method2() {

		System.out.println("This is Instance Method");
		System.out.println("Static variable with instance method-" + a);
	}

	public static void main(String[] args) {

		// Creation of Object

		Sm6 s = new Sm6();

		// calling instance type of method

		s.method2();

	}

}
