package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	//Constructors
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	//Getters and Setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Methods
	
	public void updateBalance() {
		balance += balance * interestRate; // Atualizando valor da conta com juros 
	}
	
	@Override // Avisa caso o nome do método não seja igual ao da SuperClasse
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
