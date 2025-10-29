package com.cdac.lamda;

@FunctionalInterface
interface Square{
	int area(int x);
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		Square s1 = (side) -> side * side;
		System.out.println("Area of square="+s1.area(6));
		

	}

}
