package practice;

public class BankAccountDemo {
	int acc_no;
	String accHolderName;
	double amount;

	void openAccount(int i, String s, double d) {
		acc_no = i;
		accHolderName = s;
		amount = d;
	}

	void displayAccountInfo() {
		System.out.println("Account is created below");
		System.out.println("Account number --> " + acc_no + " \n " + "Account holder Name -->" + accHolderName + " \n "
				+ "Initial Amount -->" + amount);
	}

	void checkBalance() {
		System.out.println("Available balance is : " + amount);
	}

	void deposit(double depositAmt) {
		amount = amount + depositAmt;
		System.out.println("Amount Deposited :" + depositAmt);
	}

	void withdraw(double withdrawAmt) {
		if (withdrawAmt > amount) {
			System.out.println("Insufficient balance...");
		} else {
			amount = amount - withdrawAmt;
			System.out.println("Amount Withdrawn : " + withdrawAmt);
		}
	}

	public static void main(String[] args) {
		BankAccountDemo acc = new BankAccountDemo();
		acc.openAccount(111, "Akshay Khot", 1000);
		acc.displayAccountInfo();
		acc.checkBalance();
		acc.deposit(9000);
		acc.checkBalance();
		
		acc.withdraw(10000);
		acc.checkBalance();

	}

}
