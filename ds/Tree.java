import java.util.*;

class Node{
	int val;
	Node left;
	Node right;

	Node(int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}

	Node(int val,Node left, Node right){
		this.val=val;
		this.left=left;
		this.right=right;
	}

	public void setVal(int val){
		this.val=val;
	}

	public void setLeft(Node left){
		this.left=left;
	}

	public void setRight(Node right){
		this.right=right;
	}

	public int getVal(){
		return this.val;
	}

	public Node getLeft(){
		return this.left;
	}

	public Node getRight(){
		return this.right;
	}
}

class BinaryTree{
	Node root;

	BinaryTree(){
		root=null;
	}

	public void insertNode(int number){
		Node n=new Node(number);
		if(root==null){
			root=n;
		}
		else{
			Node curr = root;
			addNode(curr,n);
		}
	}

	public void addNode(Node curr, Node newNode){
		if(curr.getVal() >  newNode.getVal()){
			if(curr.getLeft()==null){
				curr.setLeft(newNode);
			}
			else{
				addNode(curr.getLeft(),newNode);
			}
		}
		else{
			if(curr.getRight()==null){
				curr.setRight(newNode);
			}
			else{
				addNode(curr.getRight(),newNode);
			}

		}
	}

	public void inOrder(Node curr){
		if(curr==null){
			return;
		}
		else{
			inOrder(curr.getLeft());
			System.out.println(curr.getVal());
			inOrder(curr.getRight());
			
		}
	}
	public void preOrder(Node curr){
		if(curr==null){
			//System.out.println("Tree is empty.");
			return;
		}
		else{
			System.out.println(curr.getVal());
			preOrder(curr.getLeft());
			preOrder(curr.getRight());
		}
	}
	public void postOrder(Node curr){
		if(curr==null){
			//System.out.println("Tree is empty.");
			return;
		}
		else{
			postOrder(curr.getLeft());
			postOrder(curr.getRight());
			System.out.println(curr.getVal());
		}
	}

	public int heightTree(Node curr){
		if(curr==null) return 0;
		else return max( heightTree(curr.getLeft()), heightTree(curr.getRight()) )+1;
	}

	public void printInTree(){
		inOrder(root);
	}
	public void printPreTree(){
		preOrder(root);
	}
	public void printPostTree(){
		postOrder(root);
	}

	public int height(){
		return heightTree(root);
	}

	int max(int a, int b){
		if(a>b) return a;
		else return b;
	}

	/*public void levelOrder(Node curr){
		System.out.println(dQueue);
		enQueue(curr.getLeft().getVal());
		enQueue(curr.getRight().getVal());
		if(curr.getLeft()==null){
			 levelOrder(curr.getRight());
		}
		else levelOrder(curr.getLeft());
	}

	public void printLevelOrder(Node root){
		enQueue(root.getVal());
		levelOrder(root);
	}*/

}


class Tree{
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();;
		while(true){
			System.out.println("1. To create a tree.");
			System.out.println("2. To add a node in tree.");
			System.out.println("3. To display in inOrder.");
			System.out.println("4. To display in preorder.");
			System.out.println("5. To display in postorder.");
			System.out.println("6. To find the height of the tree.");
			System.out.println("0. To exit.");
			Scanner scanner=new Scanner(System.in);
			int n=scanner.nextInt();
			switch(n){
				case 1:
					bt=new BinaryTree();
					break;
				case 2:
					System.out.println("Enter the node: ");
					int z=scanner.nextInt();
					bt.insertNode(z);
					break;
				case 3:
					System.out.println("Tree in inorder traversal.");
					bt.printInTree();
					break;
				case 4:
					System.out.println("Tree in preorder traversal.");
					bt.printPreTree();
					break;
				case 5:
					System.out.println("Tree in postorder traversal.");
					bt.printPostTree();
					break;
				case 6:
					System.out.println("Height of tree is:" + bt.height());
					break;
				default:
					return;
			}
		}
	}
}










