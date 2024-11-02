#include <stdio.h>
void main()
{
    int N=8;
    double sum=0,sum_v=0,n=8;
    int array[N];
    for(int i=0;i<N;i++)
    {
        array[i]=0;
    }
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
        sum+=array[i];
    }

    double result=sum/n;
    printf("%.2lf ",result);

    for(int i=0;i<8;i++)
    {
        sum_v+=(array[i]-result)*(array[i]-result);
    }
    double allsum=sum_v*((double)1/7);
    printf("%.2lf",allsum);
}
