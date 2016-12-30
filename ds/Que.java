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
		return front==0 && rear==size-1;
	}

	public void push(int n){
		a[++rear]=n;
	}

	public void pop(int n){
		return a[++front];
	}

	public void displayRear(){
		return a[rear];
	}

	public void displayFront(){
		return a[front];
	}

}