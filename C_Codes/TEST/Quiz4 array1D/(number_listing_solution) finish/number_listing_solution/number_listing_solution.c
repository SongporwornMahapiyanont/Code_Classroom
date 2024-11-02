#include <stdio.h>
void main()
{
    int N,input;
    scanf("%d",&N);
    int array[10001];
    for(int i=1;i<=10000;i++)
    {
        array[i]=0;
    }
    for(int j=0;j<N;j++)
    {
        scanf("%d",&input);
        array[input] = 1;
    }
    for(int i=1;i<=10000;i++)
    {
        if(array[i]>0)
        {
            printf("%d ",i);
        }
    }

}
