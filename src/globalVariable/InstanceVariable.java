package globalVariable;

public class InstanceVariable {
	// variable declaration
	// variable initialization
	// Global-Instance/Non Static variable type
	int x = 10;

	public static void main(String[] args) {

		// when we want to use the instance variable we will require the object

		// object create
		InstanceVariable i = new InstanceVariable();

		System.out.println(i.x);

	}

}
