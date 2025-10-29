package com.cdac.th;

class Add implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " started...");
		int sum=0;
		for(int i=0;i<20;i++) {
			sum+=i;
		}
		System.out.println("Sum = "+sum+ Thread.currentThread().getName()+"End...");
	}
}

class Multiply implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started........");
		int rest=1;
		for(int i=1;i<10;i++) {
			rest *= i;
		}
		System.out.println("Product = "+rest+ Thread.currentThread().getName()+"End...");
	}
	
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Add(),"T1" );
		Thread t2 = new Thread(new Multiply(),"T2" );
		
		t1.start();
		t2.start();
	

	}

}
