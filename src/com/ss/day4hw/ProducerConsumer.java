/**
 * 
 */
package com.ss.day4hw;


/**
 * @author Jordf
 *
 */
public class ProducerConsumer {
	public static void main(String[] args) {
		
		BoundedBuffer buff = new BoundedBuffer(5);
		Producer _p = new Producer(buff);
		Consumer _c1 = new Consumer(buff);
		Consumer _c2 = new Consumer(buff);
		

		_p.start();
		_c1.start();
		
			try {
				_p.join();
				_c1.interrupt();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		

	}

}
