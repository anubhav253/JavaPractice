import java.util.*;
class Node{
	int top;
	int[] a;
	int size;
	Node(int size){
		this.size=size;
		top=-1;
		a=new int[size];
	}


	public void push(int n){
		a[++top] = n;
	}
	public int pop(){
		return a[top--];
		
	}
	public int display(){
		 return a[top];

	}
	public boolean isEmpty(){
		if(top==-1){

			//System.out.println("Stack is empty.");
			return true;
		}
		else{
			//System.out.println("Stack is full.");
			return false;
		}
	}
	public boolean isFull(){
		if (top==size-1){
			//System.out.println("Stack is Full.");
			return true;
		}
		else{
			//System.out.println("Stack is empty.");
			return false;
		}
	}
	public void printStack(){
		System.out.println("Element in stack are: ");
		for (int i=0;i<top+1 ;i++ ) {
			System.out.print(a[i]+" -> ");
		}
					System.out.println("");
	}
}
class Stack{
	public static void main(String[] arg){
		System.out.println("Enter the size of stack: ");
		Scanner scanner=new Scanner(System.in);
		int size= scanner.nextInt();
		Node obj = new Node(size);
		while(true){
			System.out.println("1. To push");
			System.out.println("2. To pop");
			System.out.println("3. To display top element");
			System.out.println("4. To print stack");
			//System.out.println("5. To check stack is empty ");
			//System.out.println("6. To check stack is full");
			System.out.println("0. To exit");
			int n=scanner.nextInt();
			switch(n){
				case 1:
					int p;
					if(obj.isFull()==false){
						System.out.println("Enter the number: ");
						p=scanner.nextInt();
						obj.push(p);
					}
					else
						System.out.println("Stack is full.");
					break;
				case 2:
					if(obj.isEmpty()==false){
						int temp=obj.pop();
						System.out.println("Element popped "+temp);
					}
					else
						System.out.println("Stack is empty.");
					break;
				case 3:
					if (obj.isEmpty()==false) {
						int temp=obj.display();
						System.out.println("Top element is "+temp);
						
					}
					break;
				case 4:
					if (obj.isEmpty()==false) {

						obj.printStack();
					}
					break;
				case 5:
					obj.isEmpty();
					break;
				case 6:
					obj.isFull();
					break;
				default:
					System.out.println("Closing the program...");
					return ;
			}
		}
	}

}
