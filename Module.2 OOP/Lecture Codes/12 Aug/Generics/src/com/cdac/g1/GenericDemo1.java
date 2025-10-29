package com.cdac.g1;
class Test<T,U>{
	T t1;
	U t2;
	Test(T t1, U t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public void display(){
		System.out.println(t1);
		System.out.println(t2);
	}
	
}



public class GenericDemo1 {
	public static void main(String[] args) {
		Test<Integer, String> to1 = new Test<>(15, "CDAC");
		to1.display();
		
		Test<Integer, Integer> to2 = new Test<>(15, 30);
		to2.display();
		
		Test<Double, Integer> to3 = new Test<>(15.2345, 30);
		to2.display();
		
	}

}
