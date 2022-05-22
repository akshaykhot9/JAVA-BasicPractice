package loops;

public class Reverse {
	public static void main(String[] args) {
		int n = 123;
		int r = 0;
		int m;

		while (n > 0) {
			m = n % 10; // 3 ,

			r = r * 10 + m; // 3

			n = n / 10; // 12/10=1,
		}
		System.out.println(r);

	}

}
