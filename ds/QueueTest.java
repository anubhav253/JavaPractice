import java.util.*;
class Queue{
	int rear, front,size;
	int[] a;
	Queue(int size){
		this.size=size;
		rear=-1;
		front=0;
		a=new int[size];
	}
	public boolean isEmpty(){
		return front==-1;
	}
	public boolean isFull(){
		return rear==size-1;
	}

	public void push(int n){
		a[++rear]=n;
	}

	public int pop(){
		return a[front++];
	}

	public int displayRear(){
		return a[rear];
	}

	public int displayFront(){
		return a[front];
	}

	public void printQueue(){
		       for (int i = front; i <= rear; i++)
	           		System.out.print(a[i]+" ->");
	        	System.out.println();        
	}

}



class QueueTest{
	public static void main(String[] arg){
		System.out.println("Enter the size of stack: ");
		Scanner scanner=new Scanner(System.in);
		int size= scanner.nextInt();
		Queue obj = new Queue(size);
		while(true){
			System.out.println("1. To push");
			System.out.println("2. To pop");
			System.out.println("3. To display front element");
			System.out.println("4. To display rear element");
			System.out.println("5. To print queue");
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
						System.out.println("Queue is full.");
					break;
				case 2:
					if(obj.isEmpty()==false){
						int temp = obj.pop();
						System.out.println("Element popped "+temp);
					}
					else
						System.out.println("Queue is empty.");
					break;
				case 3:
					if (obj.isEmpty()==false) {
						int temp=obj.displayFront();
						System.out.println("Front element is "+temp);
						
					}
					break;
				case 4:
					if (obj.isEmpty()==false) {
						int temp=obj.displayRear();
						System.out.println("Rear element is "+temp);	
					}
					break;
				case 5:
					if (obj.isEmpty()==false) {

						obj.printQueue();
					}
					break;
				default:
					System.out.println("Closing the program...");
					return ;
			}
		}
	}

}
