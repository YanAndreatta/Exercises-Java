package entities;

public class LegalPerson extends Person {

	private int numberOfEmployee;

	public LegalPerson(String name, Double annualIncome, int numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		if (getNumberOfEmployee() > 10) {
			return getAnnualIncome() * 0.14;
			
		} else {
			return getAnnualIncome() * 0.16;
			
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
