#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    char array[N][N];

    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            array[i][j]=' ';
        }
    }

    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
           array[0][col]='*';
           array[N-1][col]='*';
           array[row][0]='*';
           array[row][N-1]='*';
        }
    }

    for(int i=0;i<(N/2);i++)
    {
        for(int j=0;j<N;j++)
        {
            array[i][i]='*';
            array[i][(N-i)-1]='*';
            array[(N/2)][(N/2)]='*';
            array[i][N/2]='*';
        }
        printf("\n");
    }


    for(int i=N/2;i<=(N/2)+5;i++)
    {
        for(int j=0;j<N;j++)
        {
            array[i][j]='*';
        }
        printf("\n");
    }

    for(int i=(N/2)+5;i>N;i--)
    {
        for(int j=0;j<N;j++)
        {
            array[i][j]='*';
        }
        printf("\n");
    }


    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
           printf("%c",array[row][col]);
        }
        printf("\n");
    }
}
