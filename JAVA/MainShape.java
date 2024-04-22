package com.assignments;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle circle = new Circle(6);
     Rectangle rectangle = new Rectangle(6,2);
     
     System.out.println("Area of Circle="+circle.area());
     System.out.println("Area of Rectangle="+rectangle.area());
	}

}
