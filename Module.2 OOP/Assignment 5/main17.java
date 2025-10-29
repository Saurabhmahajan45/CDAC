import java.util.*;

class main17{
	public static void main(String args[]){
		
		List<String> grades =Arrays.asList("A" , "B", "A", "C", "B", "A");
		Map<String, Integer> grade = new HashMap<>();
		
		for(String g: grades){
			grade.put(g, grade.getOrDefault(g, 0) +1);
		}
		
		int count = 0;
		System.out.print("Grade Distribution: ");
		for(Map.Entry<String, Integer> entry : grade.entrySet()){
			System.out.print(entry.getKey() + "=" + entry.getValue());
			if(++count < grade.size()){
			System.out.print(", ");
			}
		}
}
}