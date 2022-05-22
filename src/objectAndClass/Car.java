package objectAndClass;

public class Car {
	String Name;
	String Colour;
	int Price;
	String Company;

	public void Driving() {
		System.out.println("name of the car is " + Name);

	}

	public void parking() {
		System.out.println("colour of the car is " + Colour);

	}

	public void garage() {
		System.out.println("car price is " + Price);
		System.out.println("company of the car is" + Company);

	}

	public static void main(String[] args) {

		Car c = new Car();

		c.Name = "BMW X3";
		c.Colour = "Black";
		c.Company = "BMW";
		c.Price = 1000000;

		c.Driving();
		c.parking();
		c.garage();

	}
}
