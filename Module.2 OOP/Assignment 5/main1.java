import java.util.*;
class main1 {
	public static void main (String args[]){
		Collection<String> s = new ArrayList<>();
		s.add("Amit");
		s.add("Priya");
		s.add("Rohan");
		System.out.println(s);
		s.remove("Priya");
		System.out.print("Students: " );
		int count = 0;
		for (String s1 : s){
			System.out.print(s1);
			if(++count < s.size()){
				System.out.print(", ");
			}
		}
	}
}