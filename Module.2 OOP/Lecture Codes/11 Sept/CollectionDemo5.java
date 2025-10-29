import java.util.*;

class CollectionDemo5{
	
	public static void main(String[] args){
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Ravi");
		a.add(123.45);
		a.add(123.45);
		
		System.out.println(a);
		
		
		//Travers the collections : 
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(a);
		
		
		
		
	}
		
}