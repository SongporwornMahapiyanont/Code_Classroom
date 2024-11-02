#include <stdio.h>
#include <math.h>
void main()
{
    int N;
    int sum=0,allsum=0;
    scanf("%d",&N);
    int array[N][N];

    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            scanf("%d",&array[row][col]);
        }
    }

    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            if(row!=col)
            {
                 sum = abs(array[row][col]-array[col][row]);
                 allsum+=sum;
            }

        }
    }
    printf("%d",allsum/2);
}
