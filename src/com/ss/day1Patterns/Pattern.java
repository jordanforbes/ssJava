/**
 * 
 */
package com.ss.day1Patterns;

/**
 * @author Jordf
 *
 */
public class Pattern {

	/**
	 * @param args
	 */
	
	public static void pattern() {
		
		
		
		String[] lines = new String[] {"","","","","",""};
		
		for(int i = 1; i<=4; i++) {
			for(int j = 0; j< lines.length-1; j++) {
				lines[0]=""+i+")";
				switch(i) {
					case(1):
						lines[1]="*";
						lines[2]="**";
						lines[3]="***";
						lines[4]="****";
						lines[5]="---------";
					break;
					case(2):
						lines[5]="*";
						lines[4]="**";
						lines[3]="***";
						lines[2]="****";
						lines[1]="---------";
					break;
					case(3):
						lines[1]="     *";
						lines[2]="    ***";
						lines[3]="   *****";
						lines[4]="  *******";
						lines[5]="------------";
					break;
					case(4):
						lines[5]="     *";
						lines[4]="    ***";
						lines[3]="   *****";
						lines[2]="  *******";
						lines[1]="------------";
					break;
				}
			}
			for(String s : lines) {
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) {
		pattern();
	}

}
