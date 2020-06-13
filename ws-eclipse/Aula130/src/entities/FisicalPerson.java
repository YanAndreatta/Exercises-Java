package entities;

public class FisicalPerson extends Person {

	private Double healthSpending;

	public FisicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
			if (getAnnualIncome() < 20000.00) {
				double tax = (getAnnualIncome() * 0.15) - (getHealthSpending() * 0.5);
				return tax;
			 
			} else {
				double tax = (getAnnualIncome() * 0.25) - (getHealthSpending() * 0.5);
				return tax;
			}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + ": $ ");
		sb.append(String.format("%.2f", getAnnualIncome()));
		return sb.toString();
	}

}
