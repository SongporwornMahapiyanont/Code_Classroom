#include <stdio.h>
#include <limits.h>
void main()
{
    double amount=0;
    double allsum=0;
    int N=0;
    int MAX=INT_MIN;
    int MIN=INT_MAX;
    int floorMAX=0,floorMIN=0;
    int input=0;
    int sum=0;

    for(int o=1;o<9999999;o++)
    {
        amount=o-1;
        scanf("%d",&N);
        if(N<=0)
        {
            break;
        }
        for(int i=0;i<N;i++)
        {
            scanf("%d",&input);
            sum+=input;
        }
        printf("%d",sum);
        allsum+=sum;
        printf("\n");
        if(sum<MIN)
        {
            MIN=sum;
            floorMIN=o;
        }
        if(sum>MAX)
        {
            MAX=sum;
            floorMAX=o;
        }
        sum = 0;
    }
    printf("%d %d\n",floorMAX,MAX);
    printf("%d %d\n",floorMIN,MIN);
    printf("%.2lf",allsum/amount);
}
