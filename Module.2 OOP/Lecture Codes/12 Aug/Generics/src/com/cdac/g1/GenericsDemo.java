package com.cdac.g1;


public class GenericsDemo {
	static <T> void display(T a) {
		System.out.println("Display() : Test : a ="+a);
	}

	public static void main(String[] args) {
		display(200);
		display(222.222222);
		display("This is Generics!!");
		

	}

}
