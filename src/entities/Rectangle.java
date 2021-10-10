package entities;

public class Rectangle {
	public double width;
	public double heigth;
	
	public String areaRectangle() {
		return "Area = " +  width * heigth;
	}

	public String perimeterRectangle() {
		return "perimetro = " + (width + heigth) * 2;
	}

	public String diagonalRectangle() {
		return "diagonal = " + Math.sqrt(Math.pow(width,2) + Math.pow(heigth,2));
	}

}
