package globalVariable;

public class InstanceVariable3 {
	// variable declaration
	// variable initialization
	// Global - Instance/Non static variable Type- rule no 3

	int x;

	public static void main(String[] args) {

		// Value of Instance variable will vary from object to object

		// Object 1

		InstanceVariable3 i = new InstanceVariable3();
		i.x = 10;
		System.out.println(i.x);

		// Object 2

		InstanceVariable3 i1 = new InstanceVariable3();
		i1.x = 20;
		System.out.println(i1.x);

		// Object 3

		InstanceVariable3 i2 = new InstanceVariable3();
		i2.x = 30;
		System.out.println(i2.x);

	}

}
