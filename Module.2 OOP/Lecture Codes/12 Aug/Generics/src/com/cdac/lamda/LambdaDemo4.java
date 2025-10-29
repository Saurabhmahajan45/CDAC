package com.cdac.lamda;

@FunctionalInterface
interface oddeven{
	boolean show(int num);
	
}

public class LambdaDemo4 {

	public static void main(String[] args) {
		
		oddeven oe1 = (n) -> n%2 == 0; 
		
		System.out.println(oe1.show(10));
		System.out.println(oe1.show(11));
	}

}
