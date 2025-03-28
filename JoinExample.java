package com.jtc.p1;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(5000); // 500ms ke liye thread sleep karega
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class JoinExample {
	public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();
		
		   try { 
			   t1.join(); 
                }
		  catch (InterruptedException e) { 
			   System.out.println(e); 
			   }
		  
		         
        t2.start(); 
   
   }}
