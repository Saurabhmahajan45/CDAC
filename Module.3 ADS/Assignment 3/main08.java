class main08{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	main08(){
		root = null;
	}
	
	main08(int n){
		root = new Node(n);
	}
	
	void inorder(Node n){
		if(n == null)
			return;
		
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	
	void preorder(Node n){
		if(n == null)
			return;
		
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	void postorder(Node n){
		if(n == null)
			return;
		
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + " ");
	}
	
	public static void main(String args[]){
		main08 t1 = new main08(10);
		
		t1.root.left = new Node(20);
		t1.root.right = new Node(30);
		t1.root.left.left = new Node(40);
		t1.root.left.right = new Node(50);
		
		System.out.print("Inorder: ");
		t1.inorder(t1.root);
		System.out.println();
		
		System.out.print("Preorder: ");
		t1.preorder(t1.root);
		System.out.println();
		
		System.out.print("Postorder: ");
		t1.postorder(t1.root);
		
	}
}