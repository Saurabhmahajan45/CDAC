import java.util.*;

class CollectionDemo4{
	
	public static void main(String[] args){
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Ravi");
		a.add(123.45);
		a.add(123.45);
		
		System.out.println(a);
		
		
		//Travers the collections
		for(Object obj : a){
			System.out.println(obj);
		}
		
		
		
		
	}
		
}