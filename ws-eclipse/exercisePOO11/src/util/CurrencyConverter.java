package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarPrice(double dollarPrice, double amountDollar) {
		dollarPrice += dollarPrice * IOF;
		return dollarPrice * amountDollar;
	}
}
