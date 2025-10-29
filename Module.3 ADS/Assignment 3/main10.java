class main10{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data =d;
			left = right = null;
		}
	}
	
	main10(){
		root = null;
	}
	
	main10(int n){
		root = new Node(n);
	}	
	
	void inorder(Node n){
		if(n == null)
			return;
		
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	
	void insert(int key){
		root = insertdata(root,key);	
	}
	
	Node insertdata(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key < root.data){
			root.left = insertdata(root.left, key);
		}else if(key > root.data){
			root.right = insertdata(root.right, key);
		}
		return root;
	}
	
	public static void main(String args[]){
		main10 t1 = new main10();
		
		t1.insert(50);
		t1.insert(30);
		t1.insert(20);
		t1.insert(40);
		t1.insert(70);
		t1.insert(60);
		t1.insert(80);
		
		System.out.print("Tree(BST)Inorder: " );
		t1.inorder(t1.root);
	}
}