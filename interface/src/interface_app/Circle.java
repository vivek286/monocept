package interface_app;

public class Circle implements IShape{
private int radius;

public Circle(int radius) {
	
	this.radius = radius;
}
public void area() {
	System.out.println("area of circle is");
}
public void desciption() {
	System.out.println("Circle are amazing");
}

}
