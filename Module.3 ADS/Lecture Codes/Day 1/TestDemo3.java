//Reverse an ArrayList

import java.util.*;

public class TestDemo3 {
    public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Chickoo"));
		System.out.println("Display original List="+list);
		
		
		/* ListIterator<String> reverse = list.listIterator();
		while(reverse.hasNext()){
			System.out.println("Display original List="+ reverse.next());
		}
		while(reverse.hasPrevious()){
			System.out.println("Display original List="+ reverse.previous());
		} */
		
		Collections.reverse(list);
       //Display
	   
	   System.out.println("Display Reverse List="+list);
    }
 }
