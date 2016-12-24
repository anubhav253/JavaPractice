#include<iostream>

class stack{
	private:
		int top;
		int a[100]; 
	public:
		stack(){
			top=-1;
		}
		
		void push(int n){
			a[++top] = n;
		}
		
		int pop(){
			return a[top--];
		}
		
		int count(){
			return top+2;
		}
		
};
