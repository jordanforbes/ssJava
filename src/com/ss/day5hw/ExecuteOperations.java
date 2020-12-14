/**
 * 
 */
package com.ss.day5hw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jordf
 *
 */
public class ExecuteOperations{

	/**
	 * @param args
	 */
	public static PerformOperation isPrime() {
		return (n)->{
			boolean prime = true;
			for(int i = 2; i <= n / 2; ++i) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
			
			if (!prime)
				return("COMPOSITE");
			else
				return("PRIME");
		};
	}
	
	public static PerformOperation isOdd() {
		return (n)->{
			if(n%2==0) {
				return("EVEN");
			}else {
				return("ODD");
			}
		};
	}
	
	public static PerformOperation isPalindrome() {
		return (n)->{
			String st = Integer.toString(n);
			boolean pal = true;
			String palStatus = "PALINDROME";
			//1221
			for(int i = 0; i<st.length()/2; i++ ) {
				int j = st.length()-i-1; 
//					System.out.println("left "+st.charAt(i));
//					System.out.println("right "+st.charAt(j));
					//should return 1,1,2,2
					if(st.charAt(i)==st.charAt(j)) {
						pal = true;
					}else {
						pal = false;
						break;
					}
				
			}
			
			if(pal == true) {
				palStatus = "PALINDROME";
			}else {
				palStatus = "NOT PALINDROME";
			}
			return palStatus;
		};
	}
	
	public static List<Integer> rightDigit(List<Integer> intList){
		return intList.stream().map((num)->num%10).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime().Perform(7));
		
		System.out.println(isOdd().Perform(8));
		
		System.out.println(isPalindrome().Perform(1263321));

		//Assignment2
		System.out.println(rightDigit(Arrays.asList(23,45,29)));
	}
}
