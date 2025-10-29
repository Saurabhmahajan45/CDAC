class BST{
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	BST(){
		root = null;
	}
	
	BST(int newdata){
		root = new Node(newdata);
	}
	
	void insert(int key){
		root = insertdata(root, key);
	}
	
	Node insertdata(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		
		if(key < root.data)
			root.left = insertdata(root.left, key);
		else if(key > root.data)
			root.right = insertdata(root.right, key);
		return root;
	}
	
	void preorder(Node n){
		if(n == null)
			return;
		
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void main(String args[]){
		BST t1 = new BST();
		
		t1.insert(50);
		t1.insert(40);
		t1.insert(10);
		t1.insert(80);
		t1.insert(60);
		t1.insert(20);
		
		System.out.println("Preorder: ");
		t1.preorder(t1.root);
	}
}