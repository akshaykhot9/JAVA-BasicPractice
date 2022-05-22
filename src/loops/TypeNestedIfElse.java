package loops;

public class TypeNestedIfElse {
	public static void main(String[] args) {

		int x = 30;
		int y = 20;

		if (x > 0 & y > 0) {

			if (x > y) {

				System.out.println("x is the maximum number");
			}

			else {
				System.out.println("y is the maximum number");
			}
		}

		else {

			System.out.println("it is negative number");
		}

	}

}
