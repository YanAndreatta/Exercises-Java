package entities;

public class Triangle {

		public double a;
		public double b;
		public double c;
	
		public double area() {
			double p = (a + b + c) / 2f;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}
}
