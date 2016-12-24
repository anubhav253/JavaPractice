#include<stdio.h>
int main(){
	int t,i,n[100],k[99];
	scanf("%d",&t);
	for(i=0;i<t;i++){
		scanf("%d  %d",&n[i],&k[i]);
	}
	for(i=0;i<t;i++){
		if(k[i]%3==0){
			printf("no\n");
		}
		else
			printf("yes\n");
	}
	return 0;
}
