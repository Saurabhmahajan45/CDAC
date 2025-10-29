package com.cdac.th;

class MyThread11 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}
	
}

public class ThreadDemo6 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" started....");
		MyThread11 t1 = new MyThread11();
		t1.setName("T1");
		MyThread11 t2 = new MyThread11();
		t2.setName("T2");
		MyThread11 t3 = new MyThread11();
		t3.setName("T3");
		MyThread11 t4 = new MyThread11();
		t4.setName("T4");
		
		t1.start();
		t.start();
		t3.start();
		
		//join(): ensures t3 thread completes execution before t4
		
		try {
			t3.join();//throws exception
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}finally {
			System.out.println("Executed...");
		}
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+" Finished....");

	}

}
