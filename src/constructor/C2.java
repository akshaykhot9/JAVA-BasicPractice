package constructor;

public class C2 {

        int id;
		char div;
		String name;
		
		public C2(int i,char c,String s) {
			this.id=i;
			this.div=c;
			this.name=s;
		}
		
		public void info(char c1) {
			this.div=c1;
			System.out.println(id + div + name);
		}
		public static void main(String[] args) {
			
			C2 var = new C2(10 , 'A' , "Akshay");

		}

	}



