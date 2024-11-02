#include <stdio.h>
void main()
{
    int N,x;
    scanf("%d",&N);
    int array[20][10];

    for(int row=0;row<N;row++)
    {
        for(int col=0;col<10;col++)
        {
            array[row][col]=0;
        }
    }

    for(int row=0;row<N;row++)
    {
        scanf("%d",&x);
        array[row][x]=1;
    }

    for(int row=0;row<N;row++)
    {
        for(int col=0;col<10;col++)
        {
            if(col!=0)
            {
                printf("%d ",array[row][col]);
                array[row][col]=0;
            }
            else
            {
                printf("%d ",array[row][col]);
            }
        }
        printf("\n");
    }

}
