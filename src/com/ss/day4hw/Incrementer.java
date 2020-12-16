package com.ss.day4hw;


public class Incrementer extends Thread {
	
  private static int shared;  // A variable shared by all incrementers
  
  private String myName;        // The name of the incrementer
  
  /**
   * Create an incrementer with a given name
   * @parameter the name of the incrementer
   */
  public Incrementer(String name) {
    myName = name;
  }
  
  /**
   * Thing to do when started
   */
  public void run() {
    shared = shared + 1;
    int temp = shared;
    System.out.println(myName + " incremented shared value " + shared);
    shared = temp + 1;
    System.out.println(myName + " incremented shared value again " + shared);
  }
  
  public static void main(String [] args) {
    Incrementer inc1 = new Incrementer("first");
    Incrementer inc2 = new Incrementer("second");
    
    shared = 0;
    
    try {
      inc1.start();
      inc2.start();
      inc1.join();
      inc2.join();
    }
    catch(InterruptedException e){
      System.err.println("Exception: " + e.getMessage());
    }
    
    System.out.println("shared at end = " + shared);
  }
}