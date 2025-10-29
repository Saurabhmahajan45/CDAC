import java.util.*;
class main11{
	public static void main(String args[]){
		List<Character> list = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		
		list.remove(0);
		System.out.print(list);
		
		List<Character> list1 = new LinkedList<>();
		list1.add('A');
		list1.add('B');
		list1.add('C');
		
		list1.set(1, 'X');
				System.out.print(list1);
	}
	

}