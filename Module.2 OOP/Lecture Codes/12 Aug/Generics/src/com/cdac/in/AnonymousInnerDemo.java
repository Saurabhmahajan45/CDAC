package com.cdac.in;

class Abc{
	void display() {
		System.out.println("display(): Inner class");
	}
	void show() {
		System.out.println("display(): Inner class");
	}
}
public class AnonymousInnerDemo {

	public static void main(String[] args) {
		
		Abc a1 = new Abc() {
			@Override
			void display() {
				System.out.println("display(): Child Inner class");
			}
			
		
		};
		
		a1.display();//method call
		//a1.display();
		a1.show();
		

	}

}
