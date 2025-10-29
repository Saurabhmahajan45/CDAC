package com.cdac.reflection;

class Test{
	public void display(){
		System.out.println("Display() : Test: Hello Reflection!");
	}
}
class Test1{
	public void display(){
		System.out.println("Display() : Test: Hello Reflection!");
	}
}


public class RelectionDemo {

	public static void main(String[] args) {
		//Created the object
		Test t = new Test();
		//Get the runtime class of the object
		Class<?> cls = t.getClass();
		//Print class name with package details
		System.out.println("Class name ="+cls.getName());
		//-----------------------------------------------
		Test1 t1 = new Test1();
		
		Class<?> cls1 = t1.getClass();
		
		System.out.println("Class name ="+cls1.getName());

	}

}
