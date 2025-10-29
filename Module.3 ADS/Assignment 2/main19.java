class main19{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	void insert(int newData){
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	void insertAfter(Node prevNode, int newData){
		Node newNode = new Node(newData);
		if(prevNode == null){
			System.out.println("Cannot be null");
			return;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	void display(){
		Node n = head;
		while (n != null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
	}
	
	void reverse(){
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public static void main(String args[]){
		main19 l1 = new main19();
		
		l1.insert(10);
		l1.insertAfter(l1.head, 20);
		l1.insertAfter(l1.head.next, 30);
		l1.insertAfter(l1.head.next.next, 40);
		
		l1.display();
		System.out.println();
		
		l1.reverse();
		l1.display();
	}
}