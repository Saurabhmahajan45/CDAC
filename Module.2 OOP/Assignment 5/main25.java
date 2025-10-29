import java.util.*;

class main25{
		private static final int Limit = 3;
		LinkedList<String> history = new LinkedList<>();
		
		
		public void addCommand(String command){
			if(history.size() == Limit){
				history.removeFirst();
			}
			history.addLast(command);
		}
		
		public void displayHistory(){
			System.out.print("Recent Coomands: ");
			int count = 0;
			for(String cmd : history){
				System.out.print(cmd);
				if(++count < history.size()){
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	
	public static void main(String args[]){
		main25 tracker = new main25();
		
		tracker.addCommand("ls");
		tracker.addCommand("pwd");
		tracker.addCommand("cd..");
		tracker.addCommand("mkdir");
		
		tracker.displayHistory();
	}
}