package constructor;

public class C1 {

	int x;

	public C1(int val) {
		this(1.23f);
		this.x = val;
		System.out.println("int argument type constructor");
	}

	public C1(double d) {
		this(10);
		System.out.println("double argument type constructor");
	}

	public C1(float f) {
		System.out.println("float argument type constructor");
	}

	public static void main(String[] args) {
		C1 var = new C1(13.245);

	}

}
