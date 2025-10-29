import java.util.*;

class main4{
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		queue.add("Milk");
		queue.add("Eggs");
		queue.add("Bread");
		
		queue.remove();
		System.out.print("Items to buy : ");
		int count = 0;
		for(String q : queue){
			System.out.print(q);
			if(++count < queue.size()){
				System.out.print(", ");
			}
		}
	}
}