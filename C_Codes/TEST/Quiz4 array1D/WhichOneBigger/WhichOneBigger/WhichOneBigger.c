#include <stdio.h>
void main()
{
    int N,M;
    scanf("%d",&N);
    int array[N];
    int sum=0,sum1=0;
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    scanf("%d",&M);

    for(int i=0;i<N;i++)
    {
        if(array[i]<M)
        {
            sum+=array[i];
        }
        else if(array[i]>M)
        {
            sum1+=array[i];
        }
    }
    if(sum>sum1)
    {
        printf("%d",sum);
    }
    else if(sum<sum1)
    {
        printf("%d",sum1);
    }
}
