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
				try {
					synchronized(foo) {
						System.out.println("Thread 1 has Foo");
						
						Thread.sleep(100);
						
						synchronized(bar) {
							System.out.println("Thread 1 has Bar");
						
						}
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		
		Thread thread2 = new Thread(){
			
			public void run() {
				try {
					synchronized(bar) {
						System.out.println("Thread 2 has Bar");
						
						Thread.sleep(100);
						
						synchronized(foo) {
							System.out.println("Thread 1 has Foo");
							
						}
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		
		thread1.start();
		thread2.start();
	}
}