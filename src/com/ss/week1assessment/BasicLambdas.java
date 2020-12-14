/**
 * 
 */
package com.ss.week1assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jordf
 *
 */
public class BasicLambdas {

	static String[] arr = new String[] {"eagles","Seventy-Sixers","everyone else","Brewins","Phantoms","Philz","Athletics","Cavaliers"};
	
	public static void main(String[] args) {
		
		System.out.println("UNEDITED: "+Arrays.toString(arr));
		
		//sort length
		Arrays.sort(arr, (a, b)->{
//			if(a.length()<b.length()) {
//				return -1;
//			}else if(a.length()>b.length()) {
//				return 1;
//			}else {
//				return 0;
//			}
			return Integer.compare(a.length(), b.length());
		});
		
		System.out.println(Arrays.toString(arr));
		
		// reverse sort
		Arrays.sort(arr, (a, b)->{
			return Integer.compare(b.length(), a.length());
		});
		
		System.out.println(Arrays.toString(arr));

		// alphabetical
		Arrays.sort(arr, (a, b)->{
			return Character.compare(a.charAt(0),b.charAt(0));
		});
		
		System.out.println(Arrays.toString(arr));
		
		//e first
		Character e = "e".charAt(0);
		Arrays.sort(arr, (a, b)->{
			if(a.charAt(0) == e && b.charAt(0) !=e ) {
				return -1;
			}else if(a.charAt(0) != e && b.charAt(0) == e){
				return 1;
			}else {
				return 0;
			}
			
		});
		
		System.out.println(Arrays.toString(arr));

		//e helper method
		Arrays.sort(arr, Utils::eFirst);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(commaSeparator(testList));

	}
	static List<Integer> testList = Arrays.asList(1,2,3,4,5,30,45);
	
	static String commaSeparator(List<Integer> intList) {

		
		return intList.stream().map((num)->{
			if(num%2==0) {
				return "e"+num;
			}else {
				return "o"+num;
			}
		}).collect(Collectors.joining(", "));
		
	}

}
