package loops;

public class Rev1 {
	public static void main(String[] args) {

		int no = 12345;
		int rim = 0;
		int rev = 0;

		while (no != 0) {
			rim = no % 10;
			rev = rev * 10 + rim;
			no = no / 10;
		}
		System.out.println(rev);

	}
}
