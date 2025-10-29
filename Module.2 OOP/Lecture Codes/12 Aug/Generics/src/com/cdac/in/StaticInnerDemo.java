package com.cdac.in;

//Static Inner class
class Outer1{
	static int x = 50;
	int m = 30;
	
	class Inner1{
		static int y = 100;
		int z = 200;
		
		void display(){
			System.out.println("display() : Inner class: static");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(m);
		}
	}
}

public class StaticInnerDemo {

	public static void main(String[] args) {
		Outer1 o1 = new Outer1();
		
		Outer1.Inner1 in = o1.new Inner1();
		in.display();

	}

}
