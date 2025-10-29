import java.util.*;

class NonRepeated{
	public static void main(String args[]){
		String str = "stress";
		
	    Map<Character, Integer> count = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()){
			count.put(ch, count.getOrDefault(ch, 0) + 1);
		}
		
		Character result = null;
		
		for(Map.Entry<Character, Integer> entry : count.entrySet()){
			if(entry.getValue() == 1){
				result = entry.getKey();
				break;
			}
		}
		System.out.println(result);
	}
}