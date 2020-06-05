package entities;

public final class Rectangle {
	
	private double width;
	private double height;
	
	// Constructor
	
	public Rectangle() {
		this.setWidth(0);
		this.setHeight(0);
	}
	
	// Methods
	
	public double area() {
		return getWidth() * getHeight();
	}
	public double perimeter() {
		return 2 * (getWidth() + getHeight());
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
	}

	//Getters and Setters
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
}
