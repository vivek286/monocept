package demo;

public interface demo2 extends demo3{
	default void method() {
		demo3.super.method();
		System.out.println("in demo2");
	}
}
