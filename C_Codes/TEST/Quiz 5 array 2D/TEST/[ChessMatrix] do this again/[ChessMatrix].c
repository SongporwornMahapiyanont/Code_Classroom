#include <stdio.h>
void main()
{
    int M,N,K;
    scanf("%d %d",&M,&N);
    int array[M][N];
    for(int row=0;row<M;row++)
    {
        for(int col=0;col<N;col++)
        {
            scanf("%d",&array[row][col]);
        }
    }
    scanf("%d",&K);
    int count=1;
    for(int row=0;row<M;row++)
    {
        for(int col=0;col<N;col++)
        {
            if(row%2==0)
            {
                if(col%2!=0)
                {
                    array[row][col]+=K;
                }
            }
            else if(row%2!=0)
            {
                if(col%2==0)
                {
                    array[row][col]+=K;
                }
            }
        }
    }

    for(int row=0;row<M;row++)
    {
        for(int col=0;col<N;col++)
        {
            printf("%d ",array[row][col]);
        }
        printf("\n");
    }
}
