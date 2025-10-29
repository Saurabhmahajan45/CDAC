package com.cdac.reflection;

import java.lang.reflect.Field;

class TestA{
	public int x;
	private String name;
}

public class RelflectionDemo2 {

	public static void main(String[] args) {
		
		Class<TestA> cls = TestA.class;
		
		Field[] fields = cls.getDeclaredFields();
		
		for(Field f : fields) {
			System.out.println("Field = "+f.getName()+":"+f.getType());
		}
		
	

	}

}
