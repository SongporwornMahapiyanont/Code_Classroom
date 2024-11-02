#include <stdio.h>
void main()
{
    int K;
    scanf("%d",&K);
    int array[K][K];
    for(int row=0;row<K;row++)
    {
        for(int col=0;col<K;col++)
        {
            scanf("%d",&array[row][col]);
        }
    }

    int up=0,down=0;
    for(int row=0;row<K;row++)
    {
        for(int col=0;col<K;col++)
        {
            if(col<row)
            {
                down+=array[row][col];
            }
            if(row<col)
            {
                up+=array[row][col];
            }

        }
    }
    printf("%d\n%d",up,down);
}
