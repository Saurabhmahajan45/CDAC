class main16{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
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
	
	void delete(int key){
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
		main16 l1 = new main16();
		
		l1.append(10);
		l1.append(20);
		l1.append(30);
		l1.append(40);
		
		l1.display();
		System.out.println();
		
		l1.delete(30);
		l1.display();
	}
	
	
}