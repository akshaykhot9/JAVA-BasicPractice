package methods;

public class Sm2 {
	// argument passing
	// rule no 2
	// static method can accept the argument or parameter

	public static void method1(int a, int b) {

		int c = a + b;

		System.out.println(c);
		System.out.println("static method");

	}

	public static void main(String[] args) {

		method1(100, 200);
		method1(500, 700);
		method1(900, 450);
		method1(100, 5000);
		method1(300, 400);

	}
}
