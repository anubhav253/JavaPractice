import java.util.*;
class Recursion{
	public static void main(String[] arg){
		Scanner scanner=new Scanner(System.in);
		int t = scanner.nextInt();
		int n;
		int a[]=new int[5] ;
		for(int i=0;i<t;i++){
			n=scanner.nextInt();
			a[i]=n;
		}
		for(int i=0;i<t;i++){
			System.out.println(a[i]);
		}
		System.out.println(fact(5));
		System.out.println(fib(10));

	}


	public static int fact(int z){
		if(z<2){
			return 1;
		}
		else{
			return z*fact(z-1);
		}
	}


	public static int fib(int x){
		if(x<2)
			return 1;
		else
			return fib(x-1)+fib(x-2);
	}

	public static void recPrint(String A, int t){
		if(t == A.length()-1 ){
			return;
		}
		else{
			System.out.println(A[t]);
			return recPrint(A,t+1);
		}
	}

}
A=[1,2,3,4,5,6];

recPrint("Anubhav",0);















