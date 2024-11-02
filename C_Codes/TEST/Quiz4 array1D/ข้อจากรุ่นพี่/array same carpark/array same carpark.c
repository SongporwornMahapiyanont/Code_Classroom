#include <stdio.h>
void main()
{
    int N,C;
    scanf("%d",&N);
    int array[N+1];
    int input;
    for(int i=1;i<=N;i++)
    {
        array[i]=0;
    }
    scanf("%d",&C);
    for(int i=1;i<=C;i++)
    {
        scanf("%d",&input);
        array[input]=i;
    }
    for(int i=1;i<=N;i++)
    {
        if(array[i]>0)
        {
            printf("%d ",array[i]);
        }
        else
        {
            printf("0 ");
        }
    }
}
