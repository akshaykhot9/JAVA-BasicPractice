package loops;

public class NestedIfElse12 {
	public static void main(String[] args) {
		int a = 22;
		int b = 20;

		if (b > 0 & a > 0) {
			if (a < b) {
				System.out.println("a is the max number");
			} else {
				System.out.println("b is the max number");
			}
		} else {
			System.out.println("It is negative number");
		}

	}

}
