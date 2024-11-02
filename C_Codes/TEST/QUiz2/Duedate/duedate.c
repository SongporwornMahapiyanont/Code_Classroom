#include <stdio.h>

int main()
{
    int N,K,i,day;
    int shirt;
    int allshirt=0;
    
	scanf("%d %d",&K,&N);
	K = K*100;
	for(i=0;i<N;i++)
	{
		scanf("%d",&shirt);
		allshirt+=shirt;
		day =(allshirt+K-1)/K;
		printf("%d\n",day);
	}
    return 0;
}
