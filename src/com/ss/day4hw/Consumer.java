/**
 * 
 */
package com.ss.day4hw;

import java.util.Random;


/**
 * @author Jordf
 *
 */
public class Consumer extends Thread{
	private final BoundedBuffer buff;
	Random rand;
	
	public Consumer(BoundedBuffer b) {
		buff = b;
		rand = new Random();
	}
	
	//run at start of thread
	public void run() {
		try {
			while(true) {

				int n = buff.get();
				int sleepDur = 100 + rand.nextInt(200);
				sleep(sleepDur);

				System.out.println(n);
			}
		}catch(InterruptedException e) {}
	}

}
