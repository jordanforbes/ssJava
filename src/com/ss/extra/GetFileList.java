/**
 * 
 */
package com.ss.extra;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Jordf
 *
 */
public class GetFileList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("executed"); //debug 0
		
		try {
			System.out.println("1"); //debug 1
			
			File dir = new File("./src/com/ss/day3hw/getfiles");
			System.out.println("2"); //debug 2

			FilenameFilter filter = new FilenameFilter() {
				@Override
				
				public boolean accept(File dir, String name) {
					System.out.println("3"); //debug 3
					return name.endsWith(".java");
				}
			};
			System.out.println("4"); //debug 4

			File[] files = dir.listFiles(filter);
			
			for (int i = 0; i < files.length; i++) {
				if(i == 0) {System.out.println("5");} //debug 5

				System.out.println(files[i].getName());
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
