#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int array[N];
    int input;

    for(int i=0;i<N;i++)
    {
        scanf("%d",&input);
        array[i]=input;
    }
    for(int a=N-1;a>=0;a--)
    {
        printf("%d ",array[a]);
    }
}
