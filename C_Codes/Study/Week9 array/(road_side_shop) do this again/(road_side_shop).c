#include <stdio.h>
#include <limits.h>
void main()
{
    int N=0,K=0;
    int MAX=INT_MIN;
    scanf("%d%d",&N,&K);
    int arr[N];
    int sum=0;

    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int center=K;center<(N-K);center++)
    {
        for(int i=center-K;i<=center+K;i++)
        {
            sum=sum+arr[i];
        }
        if(sum>MAX)
        {
            MAX = sum;
        }
        sum=0;
    }
    printf("%d\n",MAX);
}
