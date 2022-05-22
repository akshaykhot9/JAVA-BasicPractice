package globalVariable;

public class GlobalVariable {

	// Variable declaration
	// variable Initialization
	// Global Type

	// Scope of Instance Variable is throughtout the class

	int x = 10;

	public static void main(String[] args) {

		// Local type

		int y = 10;

		GlobalVariable v = new GlobalVariable();

		v.x = 10;

		System.out.println(v.x);

	}

}
