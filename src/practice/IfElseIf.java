package practice;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// Alt + Shift + R -- short cut to rename a variable at multiple places
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month..");
		int month = sc.nextInt();
		if (month == 1) {
			System.out.println(month + " --> January");
		} else if (month == 2) {
			System.out.println(month + " --> February");
		} else if (month == 3) {
			System.out.println(month + " --> March");
		} else if (month == 4) {
			System.out.println(month + " --> Apr");
		} else if (month == 5) {
			System.out.println(month + " --> May");
		} else if (month == 6) {
			System.out.println(month + " --> June");
		} else if (month == 7) {
			System.out.println(month + " --> July");
		} else if (month == 8) {
			System.out.println(month + " --> August");
		} else if (month == 9) {
			System.out.println(month + " --> Sept");
		} else if (month == 10) {
			System.out.println(month + " --> Oct");
		} else if (month == 11) {
			System.out.println(month + " --> Nov");
		} else if (month == 12) {
			System.out.println(month + " --> Dec");
		} else {
			System.out.println("Month doesn’t exists..");
		}

	}
}
