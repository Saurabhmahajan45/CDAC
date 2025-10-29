package com.cdac.reflection;

import java.lang.reflect.Constructor;

class TestB{
	TestB(){
	}
	
	TestB(int a){
		
	}
	TestB(double a){
		
	}
}
public class ReflectionDemo4 {

	public static void main(String[] args) {
		
		//Get all constructors of Test class
		Constructor<?>[] cons = TestB.class.getDeclaredConstructors();
		
		for(Constructor<?> c : cons) {
			System.out.println(c);
		}

	}

}
