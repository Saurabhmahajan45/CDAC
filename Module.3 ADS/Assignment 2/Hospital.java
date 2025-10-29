import java.util.*;

class Patient {
    String name;
    int emergency; 
	
    Patient(String name, int emergency) {
        this.name = name;
        this.emergency = emergency;
    }

    @Override
    public String toString() {
        return name + " (Emergency: " + emergency + ")";
    }
}

public class Hospital{
    public static void main(String[] args) {
        
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> a.emergency - b.emergency);

        pq.add(new Patient("Harish", 3));
        pq.add(new Patient("Girish", 1));  // Most critical
        pq.add(new Patient("Shirish", 5));
        pq.add(new Patient("Saurabh", 2));

        System.out.println("Patients in queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Treating: " + pq.poll());
            
        }
    }
}