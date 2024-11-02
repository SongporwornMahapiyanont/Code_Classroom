#include <stdio.h>
void main()
{
    int N,K;
    scanf("%d",&N);
    int array[N][N];
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            scanf("%d",&array[row][col]);
        }
    }
    scanf("%d",&K);
    if(K>0 && K%2==0)
    {
        for(int row=0;row<N;row++)
        {
            for(int col=0;col<N;col++)
            {
                printf("%d ",array[row][col]);
            }
            printf("\n");
        }
    }
    else if(K>0 && K%2!=0)
    {
        for(int row=N-1;row>=0;row--)
        {
            for(int col=N-1;col>=0;col--)
            {
                printf("%d ",array[row][col]);
            }
            printf("\n");
        }
    }
    else if(K<0 && K%2==0)
    {
        for(int row=0;row<N;row++)
        {
            for(int col=0;col<N;col++)
            {
                printf("%d ",array[col][row]);
            }
            printf("\n");
        }
    }
    else if(K<0 && K%2!=0)
    {
        for(int row=N-1;row>=0;row--)
        {
            for(int col=N-1;col>=0;col--)
            {
                printf("%d ",array[col][row]);
            }
            printf("\n");
        }
    }
    else
    {
        printf("Error");
    }
}
