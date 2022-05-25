package practice;

public class ConvertIntToString3 {

	public static void main(String[] args) {
 
		int a = 1234;
		int b = 1012;
		
		String c = String.format("%d", a);
		String d = String.format("%d", b);
		
		System.out.println(c);
		System.out.println(d);
	}

}
