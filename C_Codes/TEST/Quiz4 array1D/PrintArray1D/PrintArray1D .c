#include <stdio.h>
void main()
{
    int N,X;
    scanf("%d",&N);
    int array[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    scanf("%d",&X);
    for(int j=0;j<N;j+=X)
    {
        printf("%d ",array[j]);
    }
}
