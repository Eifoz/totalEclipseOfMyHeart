import java.util.*;

public class Account {
	
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0; // all acc rate is the same.
	private Date dateCreated;  // Store date when data is created. 
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		dateCreated = new Date();
		this.id = id;
		this.balance = balance;
	}
	
	// Mutator
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	// Accessor
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public Date getDate() {
		return this.dateCreated;
	}
	
	public double getMontlyInterestRate() {
		double montlyInterestRate = this.annualInterestRate / 12;
		return montlyInterestRate;
	}
	
	public double getMontlyInterest() {
		double montlyInterest = (getMontlyInterestRate() / 100) * this.balance; 
		return montlyInterest;
	}
	
	public void withdraw(double amount) {
		if(amount >= 0) {
			this.balance = this.balance - amount;
			System.out.println("Here is the " + amount + " you wanted. your balance is now " + this.balance + ". Have a nice day." );
		} else {
			System.out.println("Nice Try, Asshole! withdraw-amount needs to be positive");
		}
	}
	
	public void deposit(double amount) {
		if(amount >= 0) {
			this.balance = this.balance + amount;
			System.out.println(amount + " was inserted. Your balance is now: " + this.balance);
		} else {
			System.out.println("Nice Try, Asshole! deposit-amount needs to be positive, we are not made of money!");
		}	
	}
}


