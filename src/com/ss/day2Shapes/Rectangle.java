/**
 * 
 */
package com.ss.day2Shapes;

/**
 * @author Jordf
 *
 */
public class Rectangle implements Shape{
	

	public Rectangle() {
		display();
		calculateArea(4,5);
	}
	
	@Override
	public void calculateArea(int l, int w) {
		int area = l*w;
		System.out.println("the area is "+area);
	}

	@Override
	public void display() {
		System.out.println("drew a rectangle!");
	}

	

}
