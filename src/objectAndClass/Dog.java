package objectAndClass;

public class Dog {
	// state variable of object

	String breed;
	String colour;
	int age;

	// behaviour of object

	public void barking() {
		System.out.println();

	}

	public void sleep() {

	}

	public void hungry() {

	}

	public void running() {

	}

	public static void main(String[] args) {

		// object create
		Dog d = new Dog();

		// object states declaration

		d.breed = "Germen Shephard";
		d.colour = "Brown";
		d.age = 10;

		// object behaviour
		d.barking();
		d.hungry();
		d.running();
		d.sleep();

	}

}
