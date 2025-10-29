import java.util.*;

class main23{
	public static void main(String args[]){
		Stack<String> history = new Stack<>();
		history.add("Google");
		history.add("YouTube");
		history.add("GFG");
		
		history.pop();
		
		System.out.print("Current history: ");
		int count = 0;
		for(String pages : history){
			System.out.print(pages);
			if(++count < history.size()){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}