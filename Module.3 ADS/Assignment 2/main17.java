class main17{
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
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
	
	int search(Node head, int x){
		Node n = head;
		int index = 0;
		while(n != null){
			if(n.data == x)
				return index;
			n = n.next;
			index++;
		}
		return -1;
	}
	
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]){
		main17 l1 = new main17();
		
		l1.append(10);
		l1.append(20);
		l1.append(30);
		l1.append(40);
		
		l1.display();
		System.out.println();
		
		int searchIndex = l1.search(l1.head, 30);
		
		if(searchIndex != -1){
			System.out.println("Element found at index " +searchIndex);
		}else{
			System.out.println("Element not found"); 
		}
	}
}