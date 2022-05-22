package methods;

public class Sm4 {
	// rule no 3 example 2
	// we can provide return type to method

	public static int summation(int x, int y) {

		int c = x + y;
		return c;
	}

	public static String multiplication() {

		String s = "Velocity";
		return s;
	}

	public static void main(String[] args) {

		System.out.println(multiplication());
		System.out.println(summation(20, 30));

		int z = summation(50, 50) + 100;
		System.out.println(z);

	}

}
