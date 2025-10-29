class main18{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	void append(int newData){
		Node newNode = new Node (newData);
		if(head == null){
			head = new Node(newData);
			return;
		}
		Node last = head;
		newNode.next = null;
		while(last.next != null){
			last = last.next;
		}
		last.next = newNode;
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + "--> ");
			n = n.next;
		}
	}
	
	int counter(){
		int count = 0;
		Node c = head;
		while(c != null){
			count++;
			c = c.next;
		}
		return count;
	}
	
	public static void main(String args[]){
		main18 l1 = new main18();
		
		l1.append(10);
		l1.append(20);
		l1.append(30);
		l1.append(40);
		
		l1.display();
		System.out.println();
		
		System.out.println("Total Nodes: " + l1.counter());
	}
}