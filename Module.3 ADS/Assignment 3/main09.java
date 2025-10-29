class main09{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	main09(){
		root = null;
	}
	
	main09(int n){
		root = new Node(n);
	}
	
	public static void main(String args[]){
		main09 t1 = new main09(1);
		
		t1.root.left = new Node(2);
		t1.root.right = new Node(3);
		t1.root.left.left = new Node(4);
		t1.root.left.right = new Node(5);
		t1.root.right.left = new Node(6);
		t1.root.right.right = new Node(7);
		
		
	}
}