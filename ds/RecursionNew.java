import java.util.*;
class RecursionNew{
	public static void main(String[] arg){
		System.out.println(fibb(10));
		System.out.println(fac(6));
		display("Anubhav",0);
		System.out.println(fib(5));
		dis("Anubhav",6);
	}
	public static int fibb(int z){
			if(z<2){
				return 1;
			}
			else{
				return fibb(z-1)+fibb(z-2);
			}
		}
	public static int fac(int x){
			if(x<1){
				return 1;
			}
			else{
				return x*fac(x-1);
			}
		}
	public static void display(String a, int t){
			if(t==a.length()){
				return;
			}
			else{
				System.out.println(a.charAt(t));
				 display(a,t+1);
			}
		}
	public static int fib(int f){
			if(f<3){
				return 1;
			}
			else{
				return fib(f-1)+fib(f-2)+fib(f-3);
			}
	}
	public static void dis(String a, int t){
		if(t<0){
			return;
		}
		else{
			System.out.println(a.charAt(t));
		dis(a,t-1);
	}
	}
		
}
