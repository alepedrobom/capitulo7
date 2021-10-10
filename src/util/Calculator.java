package util;

public class Calculator {
	public static final double PI = 3.14159;
	public static final double IOF = 0.06;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	public static double conversao(double dolar, double qtd) {
		return qtd * dolar * (1+IOF);
	}
}