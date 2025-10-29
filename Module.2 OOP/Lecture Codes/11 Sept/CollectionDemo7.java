             import java.util.*;

class CollectionDemo7{
	
	public static void main(String[] args){
		
		List a = new ArrayList();
		a.add(123);
		a.add("Ravi");
		a.add(123.45);
		a.add(123.45);
		
		System.out.println(a);
		
		//Object obj :access by index
		Object obj = a.get(1);
		System.out.println(obj);
		
		//Travers the collections : 
		ListIterator lit = a.listIterator();
		
		//Forward direction traversing
		while(lit.hasNext())
		{
			Object obj1 = lit.next();
			System.out.println(obj1);
			lit.set("111");//Value update
		}
		System.out.println();
		
		//Backward direction traversing
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		System.out.println(a);
		
		
		
		
	}
		
}