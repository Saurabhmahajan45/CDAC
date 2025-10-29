class main07{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
	
	main07(){
		root = null;
	}
	
	main07(int n){
		root = new Node(n);
	}
	
	void preorder(Node n){
		if(n == null)
			return;
		
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void main(String args[]){
		main07 t1 = new main07(1);
		
		t1.root.left = new Node(2);
		t1.root.right = new Node(3);
		t1.root.left.left = new Node(4);
		t1.root.left.right = new Node(5);
		
		t1.preorder(t1.root);
	}
	
}