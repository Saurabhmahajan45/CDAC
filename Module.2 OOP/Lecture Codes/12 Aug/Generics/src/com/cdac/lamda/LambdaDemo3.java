package com.cdac.lamda;

@FunctionalInterface
interface Test{
	int sum111(int a, int b);
}
public class LambdaDemo3 {

	public static void main(String[] args) {
		Test t1 = (a,b) -> a+b;
		System.out.println("Add="+t1.sum111(10, 20));

	}

}
