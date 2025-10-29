package com.cdac.lamda;

public class LamdaDemo5 {

	public static void main(String[] args) {
		
		Runnable r =() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Thread: "+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
