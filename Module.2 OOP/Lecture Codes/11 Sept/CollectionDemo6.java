import java.util.*;

class CollectionDemo6{
	
	public static void main(String[] args){
		
		List a = new ArrayList();
		a.add(123);
		a.add("Ravi");
		a.add(123.45);
		a.add(123.45);
		
		System.out.println(a);
		
		
		//Travers the collections : 
		ListIterator lit = a.listIterator();
		//Forward direction traversing
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		//Backward direction traversing
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		System.out.println(a);
		
		
		
		
	}
		
}