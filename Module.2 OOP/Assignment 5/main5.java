import java.util.*;
class main5{
		public static final int LIMIT = 5;
		
		List<String> search = new LinkedList<>();
		
		public void addCommand(String term){
			if(search.size()==LIMIT){
				search.removeFirst();
			}
			search.addLast(term);
		}
		
		public void displaySearch(){
			System.out.print("Recent Searches: ");
			int count = 0 ;
			for (String s: search){
				System.out.print(s);
				if (++count < search.size()){
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		
		public static void main (String args[]){
			main5 history = new main5();
			
			history.addCommand("Java");
			history.addCommand("Python");
			history.addCommand("C++");
			history.addCommand("DSA");
			history.addCommand("OOPJ");
			history.addCommand("Spring");
			
			history.displaySearch();
		}
}		