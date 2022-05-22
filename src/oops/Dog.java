package oops;

public class Dog extends Animal {
	public void bark() {
		System.out.println("dig barks");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.repeat();
		d.sleep();

	}

}
