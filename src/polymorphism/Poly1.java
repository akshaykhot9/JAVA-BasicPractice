package polymorphism;

public class Poly1 {
	public void P1() {
		System.out.println("No argument type compile time polymorphism");
	}

	public void P1(int x) {

		System.out.println("Integer argument type compile time polymorphism");
		System.out.println(x);
	}

	public void P1(String s) {
		System.out.println("String argument type compile time polymorphism");
		System.out.println(s);
	}

	public void P1(int a, String b) {
		System.out.println("Integer and String Argument type compile time polymorphism");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Poly1 p = new Poly1();
		p.P1();
		p.P1(120);
		p.P1("AKSHAYKHOT");
		p.P1(12, "AK");

	}

}
