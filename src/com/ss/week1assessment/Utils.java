/**
 * 
 */
package com.ss.week1assessment;

import java.util.Arrays;

/**
 * @author Jordf
 *
 */
public class Utils {

	/**
	 * @param args
	 */
	static Character e = "e".charAt(0);

	public static int eFirst(String a, String b) {
			if(a.charAt(0) == e && b.charAt(0) !=e ) {
				return -1;
			}else if(a.charAt(0) != e && b.charAt(0) == e){
				return 1;
			}else {
				return 0;
			}
			
		}

}
