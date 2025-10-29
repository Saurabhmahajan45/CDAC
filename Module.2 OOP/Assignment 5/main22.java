import java.util.*;

class main22{
	public static void main(String args[]){
		Queue<String> customer = new LinkedList<>();
		customer.add("Amit");
		customer.add("Priya");
		customer.add("Rohan");
		
	
		
		System.out.print("Serving: " + customer.remove() + ", Queue: ");
		int count = 0;
		for(String service : customer){
			System.out.print(service);
			if(++count < customer.size()){
				System.out.print(", ");
			}
		}
	}
}