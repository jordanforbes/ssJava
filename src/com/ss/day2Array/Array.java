/**
 * 
 */
package com.ss.day2Array;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Jordf
 *
 */
public class Array {

	/**
	 * @param args
	 */	
	
	static int[][] arr = {{0,1,20,4000},{9,40,5},{200}};
	
	
	
	public static void main(String[] args) {
		int max = arr[0][0];
		
		int x = -1;
		int y = -1;
		int xMax = 0;
		int yMax = 0;
		//gets each number from arrays
		for(int[] j: arr) {
			x+=1;
			for(int i : j) {
				y+=1;
				if(max < i) {
	
					max = i;
					xMax = x;
					yMax = y;

				}
			}
		}
		
		System.out.println("Max: "+max);
		System.out.println("index: ["+xMax+"]["+yMax+"]");
	}

}
