class main11{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	main11(){
		root = null;
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
			root.left = insertdata(root.left , key);
		}else if(key > root.data){
			root.right = insertdata(root.right, key);
		}
		return root;
	}
	
	int minValue(Node root){
		int x = root.data;
		
		while(root.left != null){
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	
	int maxValue(Node root){
		int x = root.data;
		
		while(root.right != null){
			x = root.right.data;
			root = root.right;
		}
		return x;
	}
	
	public static void main(String args[]){
		main11 t1 = new main11();
		
		t1.insert(50);
		t1.insert(30);
		t1.insert(20);
		t1.insert(40);
		t1.insert(70);
		t1.insert(60);
		t1.insert(80);
		
		System.out.print("Min: ");
		System.out.print(t1.minValue(t1.root));
		System.out.println();
		
		System.out.print("Max: ");
		System.out.print(t1.maxValue(t1.root));
	}
}