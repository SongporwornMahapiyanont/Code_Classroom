#include <stdio.h>

void main()
{
    int N,k,count=0,max=-20000000,MAX=-20000000,best;
    scanf("%d %d",&N,&k);
    int array[N][k];
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<k;col++)
        {
            scanf("%d",&array[row][col]);
            count+=array[row][col];
        }
        if(count > max)
        {
            max=count;
            best = row;
        }
        count=0;
    }
    printf("%d\n",max);


    int count_sum=0;
    for(int row=0;row<k;row++)
    {
        int count_best=0;
        for(int col=0;col<N;col++)
        {
        //printf("%d ",array[col][row]);
           if(array[col][row] > count_best)
           {
               count_best=array[col][row];
            }
        }
        //printf("count best = %d\n",count_best);
        if(count_best==array[best][row])
        {
            count_sum+=1;
        }
    }
    printf("%d",count_sum);
}
