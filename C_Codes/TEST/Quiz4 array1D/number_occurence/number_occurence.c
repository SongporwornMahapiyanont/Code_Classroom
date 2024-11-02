#include <stdio.h>
void main()
{
    int N,x;
    scanf("%d",&N);
    int array[N];
    int sum=0;
    int array2[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    scanf("%d",&x);

    for(int i=0;i<N;i++)
    {
        if(array[i]==x)
        {
            printf("%d ",i+1);
            sum+=1;
        }
    }
    if(sum==0)
    {
        printf("%d",sum);
    }
}
