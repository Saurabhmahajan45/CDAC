package com.cdac.lamda;

@FunctionalInterface
interface MyTest{
	void display();
}
public class LambdaDemo {

	public static void main(String[] args) {
		
		MyTest t1 = () -> {
			System.out.println("Hello Lambda functions!");
		};
		
		t1.display();
	}

}
