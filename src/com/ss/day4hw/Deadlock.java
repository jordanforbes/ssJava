/**
 * 
 */
package com.ss.day4hw;

/**
 * @author Jordf
 *
 */
public class Deadlock {
	public static void main(String[] args) {
		final String foo = "Foo";
		final String bar = "Bar";
		
		//thread1 tries to lock foo then bar
		Thread thread1 = new Thread(){
			
			public void run() {
				synchronized(foo) {
					System.out.println("Thread 1 has Foo");
					
					try {Thread.sleep(100);}catch(Exception e) {}
					
					synchronized(bar) {
						System.out.println("Thread 1 has Bar");
					
					}
				}
			}
		};
		
		Thread thread2 = new Thread(){
			
			public void run() {
				synchronized(bar) {
					System.out.println("Thread 2 has Bar");
					
					try {Thread.sleep(100);}catch(Exception e) {}
					
					synchronized(foo) {
						System.out.println("Thread 1 has Foo");
					
					}
				}
			}
		};
		
		thread1.start();
		thread2.start();
	}
}