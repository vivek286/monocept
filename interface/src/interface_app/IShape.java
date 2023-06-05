package interface_app;

public interface IShape {
void area();
default void desciption() {
	System.out.println("Shapes are amazing");
}
}
