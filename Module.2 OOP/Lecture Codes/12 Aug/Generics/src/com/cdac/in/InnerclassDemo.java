package com.cdac.in;
//Regular Inner class

class Outer {
	int x = 10;// Outer class variable

	class Inner {
		int y = 20;// Inner class variable

		void display() {// Inner class method
			System.out.println("display() : Inner classs");
			System.out.println(x);
			System.out.println(y);
		}

	}
}

public class InnerclassDemo {

	public static void main(String[] args) {

		Outer o1 = new Outer();// Outer class ka object
		System.out.println(o1.x);
		// o1.display();//Error

		Outer.Inner in = o1.new Inner();//Inner class object 
		in.display();
	

	}

}
