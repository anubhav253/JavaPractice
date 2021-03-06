import java.util.*;
class TestLinkedList{
	public static void main(String[] arg){

		// LinkedList ll=new LinkedList();
		// Node n=new Node(1);
		// ll.addNode(n);
		// n=new Node(2);
		// ll.addNode(n);
		// n=new Node(3);
		// ll.addNode(n);
		// n=new Node(4);
		// ll.addNode(n);
		// n=new Node(5);
		// ll.printLinked();

		LinkedList ll=null;

		while(true){
			System.out.println("1. To create a linked list.");
			System.out.println("2. To add a node at beginning.");
			System.out.println("3. To add a node at end.");
			System.out.println("4. To add a node at position.");
			System.out.println("5. To display linked list.");
			System.out.println("6. To display linked list using recursion.");
			System.out.println("7. To delete node from beginning.");
			System.out.println("8. To delete node from end.");
			System.out.println("0. To exit.");
			Scanner scanner=new Scanner(System.in);
			int n=scanner.nextInt();
			switch(n){
				case 1:
					System.out.println("Linked list created: ");
					ll=new LinkedList();
					break;
				case 2:
					if(ll==null){
						System.out.println("Linked list is empty.\nCreate linked list first.");

//warning
					}
					else{
						System.out.println("Insert the node.");
						int q = scanner.nextInt();
						Node x=new Node(q);
						ll.addNode(x);
					}
					break;
				case 3:
					if(ll==null){
						System.out.println("Linked list is empty.\nCreate linked list first.");

					}
					else{
						System.out.println("Insert the node.");
						int r = scanner.nextInt();
						Node y=new Node(r);
						ll.addAtEnd(y);
					}
					break ;
				case 4:
					if(ll==null){
						System.out.println("Linked list is empty.\nCreate linked list first.");

					}
					else{
						System.out.println("Insert the node.");
						int r = scanner.nextInt();
						Node y=new Node(r);
						ll.AddAtPosition(y);
					}
					break ;
				case 5:
					if(ll==null){
						System.out.println("Linked list is empty.\n Create linked list first.");
//warning
					}
					else{
						System.out.println("Linked list is: \n");
						ll.printLinked();	
					}
					break;
				case 6:
					if(ll==null){
						System.out.println("Linked list is empty.\n Create linked list first.");
						return ;
//warning
					}
					else{
						ll.recdis();
						System.out.println();	
					}
					break;
				case 7:
					ll.DeleteBeg();
					break;
				case 8:
					ll.DeleteEnd();
					break;
				default:
					return ;

			}
			
		}
	}

}

class Node{
	private int val;
	private Node next;
	Node(int v){
		val =v;
		next = null;
	}
	void setVal(int v){
		val = v;
	}
	void setNext(Node n){
		next=n;
	}
	int getVal(){
		return val;
	}
	Node getNext(){
		return next;
	}
}
class LinkedList{
	private Node head;
	LinkedList(){
		head=null;
	
	}
	public void setHead(Node h){
		head=h;
	}
	public Node getHead(){
			return head;
	}
	public void addNode(Node n){
		if(head==null){
			head=n;
		}
		else{
			n.setNext(head);
			head=n;
		}
	}
	public void printLinked(){
		Node currNode;
		currNode=head;
		System.out.println("Node values:");
		while(currNode!=null){
			System.out.print("-->" + currNode.getVal());
			currNode=currNode.getNext();
		}
		System.out.println();
		
	}
	public void addAtEnd(Node n){
		Node temp = head;
		Node temp2=temp;
		while(temp!=null){
			temp2=temp;
			temp=temp.getNext();
		}
		temp2.setNext(n);

	}
	public void AddAtPosition(Node z){
		System.out.println("Enter the position to insert node : ");
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		Node temp=head;
		while(n!=0){
			if(temp==null){
				System.out.println("Not found");
				return;
			}
			else{
			temp=temp.getNext();
			n--;
		}
		}
		Node temp2=temp.getNext();
		temp.setNext(z);
		z.setNext(temp2);


	}
	public void recdis(){
		System.out.print("Printing Node Values ");
		recPrint(head);
	}

	public void recPrint(Node currNode){
		if(currNode==null){
			return;
		}
		else{
			System.out.print("--> " + currNode.getVal());
			recPrint(currNode.getNext());
		}
	}
	public void DeleteBeg(){
		if(head==null){
			System.out.println("Linked list is empty.");
		}
		else{
			System.out.println("1st node is deleted from the beginning.");
			head=head.getNext();

		}
	}
	public void DeleteEnd(){
		if(head==null){
			System.out.println("Linked list is empty.");
		}
		else{
			Node curr;
			Node prev;
			prev=head;
			curr=head; 
			while(curr.getNext()!=null){
				prev=curr;
				curr=curr.getNext();
			}
			System.out.println("Last node is deleted from the beginning.");
			curr=null;
			prev.setNext(null);
		}
	}
}