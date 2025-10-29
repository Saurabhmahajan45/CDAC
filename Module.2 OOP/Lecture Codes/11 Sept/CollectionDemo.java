import java.util.*;

class CollectionDemo{
	
	public static void main(String[] args){
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Ravi");
		a.add(123.45);
		
		System.out.println(a);
		
		a.remove(123);
		
		System.out.println(a);
	}
		
}