#include <stdio.h>
void main()
{
    int R,C,K;
    scanf("%d %d",&R,&C);
    int array[101][101];
    for(int i=1;i<=100;i++)
    {
        for(int j=1;j<=100;j++)
        {
            array[i][j]=0;
        }
    }
    scanf("%d",&K);
    for(int i=1;i<=K;i++)
    {
        int r,c;
        scanf("%d %d",&r,&c);
        array[r][c]=i;
    }

    for(int row=1;row<=R;row++)
    {
        for(int col=1;col<=C;col++)
        {
            printf("%d ",array[row][col]);
        }
        printf("\n");
    }
}
