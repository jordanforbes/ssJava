/**
 * 
 */
package com.ss.day2;

import java.util.Scanner;

/**
 * @author Jordf
 *
 */
public class Add {

	/**
	 * @param args
	 */
//	public static void integer1(int x) {
//		int i = x;
//	}
//	static void integer2(int x) {
//		int i = x;
//	}
//	static void addition(int a, int b) {
//		integer1.i
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number");
			
			Integer num1 = new Integer(scan.nextInt());
			
			System.out.println("Enter a second number");
			
			Integer num2 = new Integer(scan.nextInt());
			
			
			System.out.println("the sum of "+num1+" and "+num2+" is "+Integer.sum(num1, num2));
		

	}

}
