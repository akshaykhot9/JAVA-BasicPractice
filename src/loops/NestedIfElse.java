package loops;

public class NestedIfElse {
public static void main(String[] args) {
		
		String un= "Akshay";
		String pass = "1994";
		
		if(un == "akshay") {
			if(pass == "2994") {
				System.out.println("Login successfully");
			}
			
			else {
				System.out.println("You are entered wrong password");
			}
			
		}
		else {
			System.out.println("You are entered wrong username");
		}

	}

}
