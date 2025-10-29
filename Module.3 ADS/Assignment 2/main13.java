class main13{
	 Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void insertAfter(Node prev_node, int new_data){
		Node new_node = new Node(new_data);
		if(prev_node == null){
			System.out.println("Cannot be null");
			return;
		}
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	void append(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new Node(new_data);
			return;
		}
		Node last = head;
		new_node.next = null;
		while(last.next != null){
			last = last.next;
		}
		last.next = new_node;
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " --> ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		main13 l1 = new main13();
		
		l1.insert(10);
		l1.append(20);
		l1.append(30);
		l1.append(40);
		
		l1.display();
		System.out.println();
		
		l1.insertAfter(l1.head.next, 25);
		l1.display();
		System.out.println();
	}
}