package practice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age..");
		int age = sc.nextInt();
		if (age < 18) {
			System.out.println("Kid's Age is :--> " + age);
		} else if (age >= 18 && age <= 59) {
			System.out.println("Adult age is :-->" + age);
		} else if (age >= 60 && age <= 120) {
			System.out.println("Senior Citizen age is :-->" + age);
		} else {
			System.out.println("He is expired...");
		}
	}

}
