#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int array[N][N];
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            scanf("%d",&array[row][col]);
        }
    }
    int D;
    scanf("%d",&D);
    if(D==1)
    {
        for(int row=0;row<N;row++)
        {
            for(int col=0;col<N/2;col++)
            {
                printf("%d ",array[row][col+N/2]);
            }
            for(int col=N/2;col<N;col++)
            {
                printf("%d ",array[row][col-N/2]);
            }
            printf("\n");
        }

    }
    else if(D==2)
    {
        for(int row=0;row<N/2;row++)
        {
            for(int col=0;col<N;col++)
            {
                printf("%d ",array[row+N/2][col]);
            }
            printf("\n");
        }
        for(int row=N/2;row<N;row++)
        {
            for(int col=0;col<N;col++)
            {
                printf("%d ",array[row-N/2][col]);
            }
            printf("\n");
        }

    }



}
