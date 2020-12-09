/**
 * 
 */
package com.ss.day2Shapes;

/**
 * @author Jordf
 *
 */
public class Circle implements Shape{
	
	public Circle() {
		display();
		calculateArea(10, 0);
	}

	@Override
	public void calculateArea(int l, int w) {
		int a = (int) (Math.PI * Math.pow(l, 2));
		System.out.println("the area of the circle is "+a);
		
	}

	@Override
	public void display() {
		System.out.println("drew a circle!");
		
	}

	

}
