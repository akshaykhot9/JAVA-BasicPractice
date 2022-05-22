package polymorphism;

public class P1 {
	// compile type polymorphism
	// method overloading

	public void m1() {
		System.out.println("no argument type m1 method");
	}

	public void m1(int x) {
		System.out.println("int type argument m1 method");
	}

	public void m1(String s) {
		System.out.println("String type argument m1 method");
	}

	public static void main(String[] args) {

		P1 var = new P1();
		var.m1("Akshay");
		var.m1(100);
		var.m1();

	}

}
