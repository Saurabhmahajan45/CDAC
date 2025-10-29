package com.cdac.in;

interface Xyz{
	void display();//abstract method
}
public class AnonymousDemo1 {

	public static void main(String[] args) {
		Xyz x1 = new Xyz() {
			
			public void display() {
				System.out.println("Interface implementation");
			}
		};
		
		x1.display();
	}

}
