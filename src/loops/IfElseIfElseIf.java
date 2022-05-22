package loops;

public class IfElseIfElseIf {

	public static void main(String[] args) {
		int marks = 101;

		if (marks < 50) {
			System.out.println("Your Fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("Third Class");

		} else if (marks >= 60 && marks < 70) {
			System.out.println("Second class");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("First class");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("First class with distinction");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("Outstanding");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
