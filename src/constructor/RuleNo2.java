package constructor;

public class RuleNo2 {
	// constructor can accept the parameters or arguments
	
		int x;
		
		public RuleNo2(int a) {
			
			this.x=a;
			System.out.println("This is a constructor");
			
		}
		
		public void m1() {
			System.out.println(x);
		}
		
		public static void main(String[] args) {
			
			RuleNo2 var = new RuleNo2(20);
			var.m1();
			
			

		}

}
