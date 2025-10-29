class main11{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void append(int n_data){
		Node n_node = new Node(n_data);
		if(head == null){
			head = new Node(n_data);
			return;
		}
		Node last = head;
		n_node.next = null;
		while(last.next != null){
			last = last.next;
		}
		last.next = n_node;
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " --> ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		main11 l1 = new main11();
		
		l1.append(5);
		l1.append(10);
		l1.append(15);
		l1.display();
		System.out.println();
		
		
		l1.append(20);	
		l1.append(25);
		
		l1.display();
		
	}

}