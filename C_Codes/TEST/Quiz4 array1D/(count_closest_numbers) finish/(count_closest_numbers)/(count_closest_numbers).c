#include <stdio.h>
#include <limits.h>
void main()
{
    int K,N;
    int MIN=INT_MAX;
    scanf("%d",&N);
    int array[N];
    int num=0;
    int diff=0;
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    scanf("%d",&K);

    for(int i=0;i<N;i++) ////THE KEY/////
    {
        if(array[i]>=K)
        {
            diff=array[i]-K;
        }
        else
        {
            diff=K-array[i];
        }
        if(diff<MIN)
        {
            MIN=diff;
            num=1;
        }
        else if(MIN==diff)
        {
                num++;
        }
    } ////THE KEY/////
    printf("%d\n",MIN);
    printf("%d",num);
}
