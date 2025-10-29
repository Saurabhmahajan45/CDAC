import java.util.*;

class main3{
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		queue.add("Study Java");
		queue.add("Complete Assignment");
		queue.add("Exercise");
		
		queue.remove("Exercise");
		System.out.print("Remaining tasks: ");
		int count = 0;
		for (String q : queue){
			System.out.print(q);
			if(++count < queue.size()){
				System.out.print(", ");
			}
		}
	}
}