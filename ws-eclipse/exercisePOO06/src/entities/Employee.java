package entities;

public final class Employee {
	
	private String name;
	private double GrossSalary;
	private double Tax;
	
	// Constructor
	public Employee() {
		this.setName(null);
		this.setGrossSalary(0);
		this.setTax(0);
	}
	
	  public double netSalary() {
		  return this.getGrossSalary() - this.getTax();
	  }
	 
	
	  public void increaseSalary(double percentage) {
		  double value = this.getGrossSalary() * (percentage / 100f);
		  this.setGrossSalary(value + this.getGrossSalary());
	  }
	 
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return GrossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}
	public double getTax() {
		return Tax;
	}
	public void setTax(double tax) {
		Tax = tax;
	}

	@Override
	public String toString() {
		return  name + ", $ " + String.format("%.2f", netSalary());
	}
	
	
	
	
}
