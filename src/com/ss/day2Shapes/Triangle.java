/**
 * 
 */
package com.ss.day2Shapes;

/**
 * @author Jordf
 *
 */
public class Triangle implements Shape {

	/**
	 * 
	 */
	public Triangle() {
		display();
		calculateArea(4,5);
	}

	@Override
	public void calculateArea(int l, int w) {
		int area= (l*w)/2;
		System.out.println("the area is "+area);
	}

	@Override
	public void display() {
		System.out.println("drew a triangle!");
	}

}
