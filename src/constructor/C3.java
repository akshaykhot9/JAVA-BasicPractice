package constructor;

public class C3 {
	// rule no 3
	
		int x;
		
		public C3(int val) {
			this.x=val;
			System.out.println("int argument type constructor");
		}
		
		public C3(double d) {
			this(10);
			System.out.println("double argument type constructor");
		}
		public static void main(String[] args) {
			C3 var = new C3(13.245);

		}


}
