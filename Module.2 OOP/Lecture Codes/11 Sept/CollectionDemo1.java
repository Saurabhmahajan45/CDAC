import java.util.*;

class CollectionDemo1{
	
	public static void main(String[] args){
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Ravi");
		a.add(123.45);
		a.add(123.45);
		
		System.out.println(a);
		
		Collection a1 = new ArrayList();
		a1.add(1234);
		a1.add("Raviyadav");
		a1.add(123.45456);
		a1.add("Raviyadav");
		
		System.out.println(a1);
		a.addAll(a1);
		System.out.println(a);
		System.out.println(a1);
		
		
	}
		
}