package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	
	public void getHolder(String holder) {
		this.holder = holder;
	}

	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta nº: "
			+ number
			+ ", Titular: "
			+ holder
			+ ", Saldo: $ "
			+ String.format("%.2f", balance);
	}

	
}
