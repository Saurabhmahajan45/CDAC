class main15{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	void deleteNode(int key){
		
		Node temp = head; 
		Node prev = null;
		if(temp != null && temp.data == key){
			head = head.next;
		}
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		prev.next = temp.next;
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " --> ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		main15 l1 = new main15();
		
		l1.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;
		
		l1.display();
		System.out.println();
		l1.deleteNode(40);
		l1.display();
	}
}