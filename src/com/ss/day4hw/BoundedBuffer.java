/**
 * 
 */
package com.ss.day4hw;

/**
 * @author Jordf
 *
 */
public class BoundedBuffer {
	protected int slots;
	private int[] buffer;
	private int takeOut = 0, putIn = 0;
	private int count = 0;
	
	public BoundedBuffer(int slots) {
		if(slots <=0) {
			throw new IllegalArgumentException(
					"slots <= 0");
		}
		this.slots = slots;
		buffer = new int[slots];
	}
	

	public synchronized void put(int val) throws InterruptedException {
	      while (count == slots) 
	      	wait();
	      
	      buffer[putIn] = val;
	      putIn = (putIn + 1) % slots;
	      count++;
	      notifyAll();
	   }
	
	public synchronized int get() throws InterruptedException {
		      while (count == 0) 
		      	wait();
		      int value = buffer[takeOut];
		      takeOut = (takeOut + 1) % slots;
		      count--;
		      notifyAll();
		      return value;
	   }

}
