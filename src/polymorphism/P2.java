package polymorphism;

public class P2 {
	// static method overloading

	public static void m1() {
		System.out.println("no argument type static m1 method");
	}

	public static void m1(int x) {
		System.out.println("int type argument static m1 method");
	}

	public static void m1(String s) {
		System.out.println("string type argument static method");
	}

	public static void main(String[] args) {

		m1();

	}

	// main method overloading

	public static void main(int[] args) {
		m1(10);
	}

}
