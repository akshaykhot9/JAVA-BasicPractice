package globalVariable;

public class InstanceVariable2 {
	// variable declaration
	// Global-Instance Variable/Non Static Variable-Rule no 2

	int x;
	// when there is no initialization of then we will get default values in runtime

	public static void main(String[] args) {

		InstanceVariable2 i = new InstanceVariable2();
		System.out.println(i.x);

	}

}
