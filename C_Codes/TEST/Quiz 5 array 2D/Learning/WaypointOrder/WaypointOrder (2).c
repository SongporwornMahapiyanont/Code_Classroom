#include <stdio.h>
void main()
{
    int R,C,K;
    scanf("%d %d",&R,&C);
    int array[100][100];
    for(int i=0;i<100;i++)
    {
        for(int j=0;j<100;j++)
        {
            array[i][j]=0;
        }
    }
    scanf("%d",&K);
    int r,c;
    for(int i=1;i<=K;i++)
    {
        scanf("%d %d",&r,&c);
        array[r-1][c-1]=i;
    }

    for(int row=0;row<R;row++)
    {
        for(int col=0;col<C;col++)
        {
            printf("%d ",array[row][col]);
        }
        printf("\n");
    }
}
