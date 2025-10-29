package com.cdac.reflection;

import java.lang.reflect.Method;

class Test11 {
	public void m1() {
		System.out.println("m1():Test");

	}
	
	public void m3() {
		System.out.println("m3():Test");

	}

	public void m2(String s) {
		System.out.println("m2():Test");
		System.out.println(s);
	}
}

public class ReflectionDemo1 {
	public static void main(String[] args) {
		Test11 t1 = new Test1()
		Class<?> cls = Test11.class;
		
		Method[] methods = cls.getDeclaredMethods();
		
		for(Method m : methods) {
			System.out.println(m.getName());
		}

	}

}
