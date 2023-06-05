package com.monocept.classes;

public class Rectangle {
private int width;
private int height;

public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public Rectangle(){
	this(5);
}
public Rectangle(int width) {
	this(width,10);
}
public Rectangle(int width,int height) {
	this.width=width;
	this.height=height;
}

public void display() {
	System.out.println("Height : " +this.height);
	System.out.println("Width : "+this.width);
}
}
