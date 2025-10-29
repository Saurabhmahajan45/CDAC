class main12{
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
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " --> ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		main12 l1 = new main12();
		
		l1.insert(30);
		l1.insert(20);
		l1.insert(10);
		
		l1.display();
		System.out.println();
		
		l1.insert(5);
		l1.display();
	}
}	

