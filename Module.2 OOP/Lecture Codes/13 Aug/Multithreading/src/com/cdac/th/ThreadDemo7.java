package com.cdac.th;

//sleep(): introduce delay to stagger execution
class MyThread2 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName()+" Sleeping......");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Awake......");
	}
	
}
public class ThreadDemo7 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started....");
		
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		
			
		t4.start();
		try {Thread.sleep(10000);} catch (InterruptedException e) { e.printStackTrace();}
		
	
		t2.start();
		try {Thread.sleep(10000);} catch (InterruptedException e) { e.printStackTrace();}
		
	
		t3.start();
		t1.start();
		

	}

}
