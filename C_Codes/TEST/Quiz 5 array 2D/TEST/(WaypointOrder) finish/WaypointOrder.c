#include <stdio.h>
void main()
{
    int R,C,K;
    int i=1;
    scanf("%d %d",&R,&C);
    int array[101][101];
    scanf("%d",&K);
    for(int row=1;row<=R;row++)
    {
        for(int col=1;col<=C;col++)
        {
            array[row][col]=0;
        }
    }

    for(int j=1;j<=K;j++)
    {
        int r,c;
        scanf("%d %d",&r,&c);
        array[r][c]=i;
        i+=1;
    }

    for(int row=1;row<=R;row++)
    {
        for(int col=1;col<=C;col++)
        {
            if(array[row][col]!=0)
            {
                printf("%d ",array[row][col]);
            }
            else
            {
                printf("%d ",array[row][col]);
            }
        }
        printf("\n");
    }
}
