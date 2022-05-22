package oopsConcept;

public class Child extends Parent{
	public void bike() {
		System.out.println("child bike");
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.land();
		c.bike();

	}

}
