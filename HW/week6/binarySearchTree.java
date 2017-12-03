public class binarySearchTree {
	public static Node root;
	public static void main(String arg[]){
		binarySearchTree b = new binarySearchTree();
		b.insert(1);
		b.insert(3);
		b.insert(12);
		b.insert(4);
		b.insert(8);
		b.insert(9);
		b.insert(20);
		b.insert(15);
		System.out.print("Display tree : ");
		b.display(b.root);
    System.out.println();
		System.out.println("Find 8 : " + b.find(8));
    System.out.println("Find 17 : " + b.find(17));
	}
	public binarySearchTree(){
		this.root = null;
	}
	public boolean find(int id){
		Node current = root;
		while(current!=null){
			if(current.data==id){
				return true;
			}else if(current.data>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	public void insert(int id){
		Node node = new Node(id);
		if(root==null){
			root = node;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){
				current = current.left;
				if(current==null){
					parent.left = node;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = node;
					return;
				}
			}
		}
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
}
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
