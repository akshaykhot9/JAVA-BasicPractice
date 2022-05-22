package loops;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		// int day = 3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day number");
		int day = sc.nextInt();
		sc.close();

		switch (day) {
		case 1:
			System.out.println("Today is the Monday");
			break;

		case 2:
			System.out.println("Today is Tuesday");
			break;

		case 3:
			System.out.println("Today is Wednesday");
			break;

		case 4:
			System.out.println("Today is Thursday");
			break;

		case 5:
			System.out.println("Today is Friday");
			break;

		case 6:
			System.out.println("Today is Saturday");
			break;

		case 7:
			System.out.println("Today is Sunday");
			break;

		}

	}
}
