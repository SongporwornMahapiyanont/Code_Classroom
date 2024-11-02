#include <stdio.h>
int array[1001],sum[1001];
void main()
{
    int N,W;
    scanf("%d %d",&N,&W);

    for(int i=1;i<=1000;i++)
    {
        sum[i]=0;
        array[i]=0;
        num[i]=0;
    }

    for(int i=1;i<=N;i++)
    {
        scanf("%d",&array[i]);
    }

    int w=W;
    for(int i=1;i<=N-(W-1);i++)
    {
        for(int j=i;j<=w;j++)
        {
            sum[i]+=array[j];
        }
        if(w!=N)
        {
            w+=1;
        }
        printf("%d ",sum[i]);
    }
}
