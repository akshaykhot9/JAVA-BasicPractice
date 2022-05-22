package constructor;

public class RuleNo3 {
	//constructor can call another constructor
		//one constructor can call max one constructor
		
		int x;
		
		public RuleNo3(int val) {
			
			this();
			this.x=val;
			System.out.println("int argument type constructor");
		}
		
		public RuleNo3() {
			System.out.println("char argument type constructor");
		}

		public void m1() {
			System.out.println(x);
		}
		
		public static void main(String[] args) {
			
			RuleNo3 var = new RuleNo3(20);
			var.m1();

		}


}
