#include <stdio.h>
int main ()
{
	int W,N;
	//int sum=0;//
	scanf("%d %d",&W,&N);
	
	for(int i=0;i<(W*N)+(N+1);i++)
	{
		printf("*");
	}
	printf("\n");
	
	printf("*");
	//sum+=1;//
	for(int i=0;i<N;i++)
	{
		for(int space=0;space<W;space++)
		{
			printf(" ");
		}
		printf("*");
		//sum+=1;//
		
	}
	printf("\n");
	for(int i=0;i<(W*N)+(N+1);i++)
	{
		printf("*");
	}
	
	
}
