package com.cdac.in;

//Method-local Inner Class
class Outer2 {
	int x = 5;

	void display() {
		int a = 5;// local variable in outer method
		System.out.println("display: Outer class");

		class Inner2 {
			void show(int b) {
				System.out.println("show: Inner class");
				System.out.println(a);//5
				System.out.println(b);//100

			}

		}
		
		Inner2 in = new Inner2();
		in.show(100);
		
	}

}

public class MethodLocalDemo {

	public static void main(String[] args) {
		
		Outer2 o1 = new Outer2();
		o1.display();

	}

}
