#include <stdio.h>
void main()
{

    int N,M;
    scanf("%d",&N);
    int array[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    scanf("%d",&M);
    if(M>=0)
    {
        for(int i=0;i<N;i++)
        {
            printf("%d ",array[i]+M);
        }
    }
    else if(M<0)
    {
        for(int i=N-1;i>=0;i--)
        {
            printf("%d ",array[i]+M);
        }
    }
}
