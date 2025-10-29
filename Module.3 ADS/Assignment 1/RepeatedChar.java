import java.util.*;

class RepeatedChar{
	public static void main (String args[]){
		String str = "programming";
		
		Map<Character, Integer> count = new HashMap<>();
		
		for(char ch : str.toCharArray()){
			count.put(ch, count.getOrDefault(ch, 0) + 1);
		}
		
	    List<Character> repeat = new ArrayList<>();
		for(Map.Entry<Character, Integer> entry : count.entrySet()){
		if(entry.getValue() > 1){
			repeat.add(entry.getKey());
		}
		}
		System.out.print(repeat);
	}
}