
public class Main {

	public static void main(String[] args) {
			Account Julie = new Account(666, 2.5); 
			Julie.deposit(10);
			Julie.deposit(-10);
			Julie.setAnnualInterestRate(1.02);
			Julie.getMontlyInterestRate();
	}
}
