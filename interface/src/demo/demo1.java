package demo;

public interface demo1 {
	default void method() {
		System.out.println("in demo1");
	}
}
