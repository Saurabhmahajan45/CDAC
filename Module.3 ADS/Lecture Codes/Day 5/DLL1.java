


class DLL1{
	Node head;//head start ptr of DLL
	
	static class Node{
	//data value, 2 references next & prev
	int data;
	Node next;
	Node prev;
	
	//DLL Node value initialization
	Node(int d){
		data = d;
		next = prev = null;
		
	}
	}
	
void display(Node n){
	
	Node last = null;
	System.out.println();
	System.out.print("Forward traversal");
	while(n != null){
		System.out.print(n.data+"--->");
		last = n;
		n=n.next;
	}
	System.out.println();
	System.out.print("Backward traversal");
	while(last != null){
		System.out.print(last.data+"<---");
		last = last.prev;
		
	}
	System.out.println();
}
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
				head.prev = new_node;
		head = new_node;
		
		
	}
	
	void insertAfter(Node prev_node,int new_data){
	//Node is existing or not
	if(prev_node == null){
		System.out.println("Insertion possible nahi hai!!!");
		return;
	}
	Node new_node = new Node(new_data);
	new_node.next = prev_node.next;
	prev_node.next = new_node;
	
	new_node.prev = prev_node;
	if(new_node.next != null)
		new_node.next.prev = new_node;
}
	



void append(int new_data){
	Node new_node = new Node(new_data);
	Node last = head;
	new_node.next = null;
	//DLL empty hot hai tab
	if(head == null){
		new_node.prev = null;
		head = new_node;
		return;
	}
	while(last.next != null){
		last = last.next;
	}
	last.next = new_node;
	new_node.prev = last;
		
	
	
	
}
	void deleteNode(Node del){
		//base condition
		if(head == null || del == null)
			return;
		
		if(head == del){
			head = del.next;
		}
		
		if(del.next != null){
			del.next.prev = del.prev;
		}
		
		if(del.prev != null){
			del.prev.next = del.next;
		}
		return;
		
	}



    public static void main(String[] args) {
		DLL1 d1 = new DLL1();
		d1.insert(30);//30
		//d1.display(d1.head);
		System.out.println();
		
		d1.insert(20);//20 30
		//d1.display(d1.head);
		System.out.println();
		
		d1.insert(10);//10 20 30
		//d1.display(d1.head);
		System.out.println();
		
		d1.insertAfter(d1.head,40);//10 20 30
		//d1.display(d1.head);
		System.out.println();
		
		d1.append(60);//10 20 30
		//d1.display(d1.head);
		System.out.println();
		
		d1.append(70);//10 20 30
		d1.display(d1.head);
		System.out.println();
		
		d1.deleteNode(d1.head);
		d1.display(d1.head);
		System.out.println();
		
		
    }
    
 
}
