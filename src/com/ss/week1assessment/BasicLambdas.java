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
		Arrays.sort(arr, (a, b)->{		//sort uses a function to define how each element relates to another
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
		
		//check if even or odd and separate with a comma
		System.out.println(evenOddComma(testList));
		
		//list of strings starting with a of a size of 3
		System.out.println(aOnly(a3List));

	}
	static List<Integer> testList = Arrays.asList(1,2,3,4,5,30,45);
	
	static String evenOddComma(List<Integer> intList) {

		//converts list to stream and uses modulus to test if even or odd
		return intList.stream().map((num)->{		//map only rearranges elements it can't remove them
			if(num%2==0) {
				return "e"+num;
			}else {
				return "o"+num;
			}
		}).collect(Collectors.joining(", "));
		//collects all of the parts together and adds a comma at the end
		
	}
	
	static List<String> a3List = Arrays.asList("ace","abe","allen","ben");
	
	static List<String> aOnly(List<String> strList) {
		//converts list to stream then checks if each string starts with a or is under 3 elements long
		return strList.stream().filter((str)->{			//Filter is like map but it removes elements
			if(str.charAt(0)=='a' && str.length()==3) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
	}

}
