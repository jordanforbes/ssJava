/**
 * 
 */
package com.ss.day4hw;


/**
 * @author Jordf
 *
 */
public class Producer extends Thread{
	
	//initialize buff instance
	private final BoundedBuffer buff;
	
	public Producer(BoundedBuffer b) {
		buff = b;
	}
	
	//run at start of thread
	public void run() {
		try {
			System.out.println("debug3");//debug1

			for(int i = 0; i <100; i++) {
				buff.put(i);
				sleep(100);
			}
		} catch (InterruptedException e) {}
	}
}
