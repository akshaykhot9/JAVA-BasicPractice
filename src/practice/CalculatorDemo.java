package practice;

public class CalculatorDemo {
	double a = 14.25;
	double b = 25.12;

	public void addition() {
		double c = a + b;
		System.out.println(c);
	}

	public void substraction() {
		double d = a - b;
		System.out.println(d);
	}

	public void multiplication() {
		double e = a * b;
		System.out.println(e);
	}

	public void division() {
		double f = a / b;
		System.out.println(f);
	}

	public static void main(String[] args) {

		CalculatorDemo cd = new CalculatorDemo();
		cd.addition();
		cd.division();
		cd.multiplication();
		cd.substraction();
	}

}
