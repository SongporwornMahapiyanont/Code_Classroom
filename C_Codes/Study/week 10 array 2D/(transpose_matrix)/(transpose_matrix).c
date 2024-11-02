#include <stdio.h>
void main()
{
    int r,c;
    scanf("%d%d",&r,&c);
    int array[r][c];
    for(int row=0;row<r;row++)
    {
        for(int col=0;col<c;col++)
        {
            scanf("%d",&array[row][col]);
        }
    }
    if(r>=c)
    {
        for(int row=0;row<r;row++)
        {
            for(int col=0;col<c;col++)
            {
                printf("%d ",array[col][row]);
            }
            printf("\n");
        }
    }
    else
    {
        for(int row=0;row<c;row++)
        {
            for(int col=0;col<r;col++)
            {
                printf("%d ",array[col][row]);
            }
            printf("\n");
        }
    }
}
