package objectAndClass;

public class Employee {
	String EmpFirstName;
	String EmpLastName;
	String EmpCity;
	int EmpBirthdate;
	int EmpAge;

	public void EmpWorking() {
		System.out.println("EmpFirstname is" + EmpFirstName);
		System.out.println("EmpLastname is" + EmpLastName);
		System.out.println("Empcity is" + EmpCity);
		System.out.println("EmpBirthDate is" + EmpBirthdate);
		System.out.println("Empage is" + EmpAge);
		System.out.println();

	}

	public void EmpPlaying() {

	}

	public void Hungry() {

	}

	public void Sleeping() {

	}

	public static void main(String[] args) {

		Employee e = new Employee();

		e.EmpFirstName = "AKSHAY";
		e.EmpLastName = "KHOT";
		e.EmpCity = "PUNE";
		e.EmpBirthdate = 9 / 2 / 1995;
		e.EmpAge = 27;

		e.EmpWorking();
		e.EmpPlaying();
		e.EmpWorking();
		e.Hungry();
		e.Sleeping();

	}

}
