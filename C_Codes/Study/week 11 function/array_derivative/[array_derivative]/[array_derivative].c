#include <stdio.h>
void main()
{
    int N,input,result=0;;
    scanf("%d",&N);
    int array[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    for(int i=0;i<N;i++)
    {
        printf("%d ",result);
        result = array[i+1]-array[i];
    }
}

