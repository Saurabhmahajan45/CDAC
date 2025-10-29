import java.util.*;

class CollectionDemo8{
	
	public static void main(String[] args){
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Amit");
		a.add("Komal");
		a.add("Kedar");
		a.add("Amit"); //allows duplicate
		
		System.out.println(a);
		
		//Addition at particular index
		a.add(1, "Rahul");
		System.out.println(a);
		
		//Accessing any element
		System.out.println("Retrieve info:="+a.get(2));
		
		//Modify the content
		a.set(2, "Keshav");
		System.out.println(a);
		
		//Removal of elements with index
		a.remove(2);
		System.out.println(a);
		
		//Removal of element value
		a.remove("Kedar");
		System.out.println(a);
		
		System.out.println(a.contains("Amit"));
		System.out.println(a);
		
		
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
		
		Collections.sort(a);
		System.out.println(a);
		
		List<String> subl1 = a.subList(0,1);
		System.out.println(subl1);
		System.out.println(a);
		
		//Converting ArrayList into Arrays
		String[] arr = a.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		a.clear();
		System.out.println(a);
		
		
	}
		
}