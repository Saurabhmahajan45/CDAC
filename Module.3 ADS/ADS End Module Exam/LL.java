class LL{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void append(int newdata){
		if(head == null){
			head = new Node(newdata);
			return;
		}
		Node last = head;
		Node newnode = new Node(newdata);
		newnode.next = null;
		while(last.next != null){
			last = last.next;
		}
		last.next = newnode;
	}
	
	void delete(int key){
		Node temp = head;
		if(temp != null && temp.data == key){
			head = temp.next;
		}
	}

    void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " --> ");
			n = n.next;
		}
		System.out.print("null");
	}
	
	public static void main(String args[]){
		LL l1 = new LL();
		
		l1.append(10);
		l1.append(20);
		l1.append(30);
		l1.append(40);
		l1.append(50);
		
		l1.display();
		System.out.println();
		
		l1.delete(10);
		l1.display();
		System.out.println();
		
	}
}