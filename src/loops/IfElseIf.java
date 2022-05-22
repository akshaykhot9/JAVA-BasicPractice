package loops;

public class IfElseIf {
	public static void main(String[] args) {

		int price = 15000;
		System.out.println("main start");

		if (price < 20000) {
			System.out.println("purchase realme phone");
		}

		else if (price > 20000 & price < 35000) {
			System.out.println("purchase one plus mobile");
		}

		else if (price > 35000 & price < 55000) {
			System.out.println("purchase i phone mobile");
		}

		else {
			System.out.println("main end");
		}

	}
}
