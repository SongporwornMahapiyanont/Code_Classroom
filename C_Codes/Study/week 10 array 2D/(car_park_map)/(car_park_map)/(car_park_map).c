#include <stdio.h>
void main()
{
    int M,N;
    scanf("%d %d",&M,&N);
    int array[M][N];

    int K;
    scanf("%d",&K);
    for(int r=0;r<M;r++)
    {
        for(int c=0;c<N;c++)
        {
            array[r][c]=0;
        }
    }
    for(int i=0;i<K;i++)
    {
        int R,C;
        scanf("%d %d",&R,&C);
        array[R-1][C-1]=1;
    }

    for(int row=0;row<M;row++)
    {
        for(int col=0;col<N;col++)
        {
            if(array[row][col]==1)
            {
                printf("x");
            }
            else
            {
                printf("_");
            }
        }
        printf("\n");
    }

}
