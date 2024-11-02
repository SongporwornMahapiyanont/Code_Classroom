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
            array[i] = array[i]+M;
            printf("%d ",array[i]);
        }
    }
    else
    {
        for(int i=N-1;i>=0;i--)
        {
            array[i] = array[i]+M;
            printf("%d ",array[i]);
        }
    }
}
