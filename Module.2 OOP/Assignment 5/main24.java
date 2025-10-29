import java.util.*;

class main24{
	public static void main(String args[]){
		Queue<String> printQueue = new LinkedList<>();
		
		printQueue.add("Docs1");
		printQueue.add("Docs2");
		printQueue.add("Docs3");
		
		String currentJob = printQueue.poll();
		
		System.out.print("Process: " + currentJob + ", Queue: " );
		int count = 0;
		for(String status : printQueue){
			System.out.print(status);
			if(++count < printQueue.size()){
				System.out.print(", ");
			}
		}
		System.out.print(" ");
			
	}
 
}