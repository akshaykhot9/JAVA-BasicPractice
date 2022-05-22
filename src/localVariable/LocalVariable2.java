package localVariable;

public class LocalVariable2 {
	public void m1() {

		// local variable

		int y = 20;

		System.out.println(y);
	}

	// rule no 3
	// scope of the local variable is within method or braces where we have to
	// declare it

	public static void main(String[] args) {

		// local variable

		int x = 10;
		System.out.println(x);

	}

}
