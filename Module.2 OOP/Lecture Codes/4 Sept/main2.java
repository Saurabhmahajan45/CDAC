import java.util.*;

class main2{
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		queue.add("Amit");
		queue.add("Priya");
		queue.add("Rohan");
		
		queue.remove();
		System.out.println("Queue: " +queue);
	}
}