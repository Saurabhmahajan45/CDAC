import java.util.*;

class main2{
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		queue.add("Amit");
		queue.add("Priya");
		queue.add("Rohan");
		
		queue.poll();
		System.out.print("Queue: ");
		int count = 0;
		for(String q : queue){
			System.out.print(q);
			if(++count < queue.size()){
				System.out.print(", ");
			}
		}
	}
}