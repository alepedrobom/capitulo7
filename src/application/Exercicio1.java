package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		System.out.println(rectangle.areaRectangle());
		System.out.println(rectangle.perimeterRectangle());
		System.out.println(rectangle.diagonalRectangle());
		sc.close();
	}

}
