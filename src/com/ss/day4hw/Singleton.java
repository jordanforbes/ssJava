/**
 * 
 */
package com.ss.day4hw;

/**
 * @author Jordf
 *
 */
public class Singleton {

	/**
	 * @param args
	 */
	private static Singleton instance;
	
	public static Singleton getInstanceDC() {
		//single check
		if(instance == null) {
			synchronized (Singleton.class) {
				//double check
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
