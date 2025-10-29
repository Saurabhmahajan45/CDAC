import java.util.*;

class main28{
	public static void main(String args[]){
		Map<String, List<String>> department = new HashMap<>();
		
		department.put("IT", Arrays.asList("Amit, Roahan"));
		department.put("HR", Arrays.asList("Priya"));
		
		System.out.print("Department Structure: ");
		
		int count = 0;
		int deptcount = 0;
		
		for(Map.Entry<String, List<String>> entry : department.entrySet()){
			System.out.print(entry.getKey() + ": ");
			List<String> employee = entry.getValue();
			for(String e: employee){
				System.out.print(e);
				if(++deptcount < department.size()){
					System.out.print("; ");
				}
			}
			if(++count < employee.size()){
				System.out.print(", ");
			}
		}
	}
}