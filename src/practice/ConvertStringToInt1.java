package practice;

public class ConvertStringToInt1 {

	public static void main(String[] args) {

		String a = "12365";
		int b = 14289;
		
		int c = Integer.valueOf(a);
		System.out.println("Convert String to integer using Integer.valueOf() method --->" + c);
		System.out.println(b);
	}

}
