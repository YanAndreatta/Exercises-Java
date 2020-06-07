package entities;

public class ContaBanco {
	// Atributos
	private double contNumber; 
	private	String name;
	private double balance;
	
	//Constructor
	public ContaBanco() {
	}
	
	public ContaBanco(String name) {
		this.contNumber = (int)(Math.random() * ((100 - 1) + 1) + 1);
		this.setName(name);
		this.setBalance(0);
	}
	
	//Getters and Setters	
	public double getContNumber() {
		return contNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Methods privates
	public void deposit(double deposit) {
		this.setBalance(this.getBalance() + deposit);
	}
	public void withdraw(double withdraw) {
		if(this.getBalance() <= 0) {
			System.out.println("You don't have enough balance");
		} else {
			this.setBalance(this.getBalance() - withdraw);
			this.setBalance(this.getBalance() - 5);
		}
	}

	@Override
	public String toString() {
		return 	"Account: "  + (int)contNumber
				+ ", Holder: " + name 
				+ String.format(", balance: $ %.2f", balance);
	}
	
	
	
}
