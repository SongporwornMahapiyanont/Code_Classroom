#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    char array[N+1][N+1];

    for(int i=1;i<=N;i++)
    {
        for(int j=1;j<=N;j++)
        {
            array[i][j]='*';
        }
    }
    int star=(N/2)+1;
    int STAR=1;
    for(int i=1;i<=(N/2)+1;i++)
    {
        for(int j=1;j<=(N-STAR)/2;j++)
        {
            printf(" ");
        }
        for(int j=1;j<=STAR;j++)
        {
            printf("%c",array[i][star]);
        }
        printf("\n");
        STAR+=2;
    }
    STAR-=4;
    for(int i=1;i<=(N/2);i++)
    {
        for(int j=1;j<=(N-STAR)/2;j++)
        {
            printf(" ");
        }
        for(int j=1;j<=STAR;j++)
        {
            printf("%c",array[i][star]);
        }
        printf("\n");
        STAR-=2;
    }
}
