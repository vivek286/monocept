package interface_app;

public class Triangle implements IShape {
private int side1,side2,side3;

public Triangle(int side1, int side2, int side3) {
	
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}
public void area() {
	System.out.println("Sides of triangle are");
}
}
