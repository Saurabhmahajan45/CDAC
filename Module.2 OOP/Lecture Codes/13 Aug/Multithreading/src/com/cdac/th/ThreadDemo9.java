package com.cdac.th;


class Counter1 extends Thread{
	int count = 0;
	//Non-access specifier: Apply mutual exclusion
	synchronized void increment() {
		count++;
	}
	
}

public class ThreadDemo9 {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName()+ "---started");
		Counter1 c1 = new Counter1();
		
		Thread t1 = new Thread(() -> {
			for(int i =0 ;i<1000;i++) {
				c1.increment();
			}
		}," T1");
		
		Thread t2 = new Thread(() -> {
			for(int i =0 ;i<1000;i++) {
				c1.increment();
			}
		}," T2");
		
		t1.start();
		t2.start();
		
		
		//t2.join();
		t1.join();
		
		System.out.println("Count="+c1.count);
		
		System.out.println(Thread.currentThread().getName()+ "---finished");
		
	}

}
