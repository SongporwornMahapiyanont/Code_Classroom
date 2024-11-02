#include <stdio.h>
void main()
{
    int N,M,x,y,result=0;
    scanf("%d %d",&N,&M);
    int array[N+1][M+1];
    for(int i=1;i<=N;i++)
    {
        for(int j=1;j<=M;j++)
        {
            scanf("%d",&array[i][j]);
        }
    }
    scanf("%d %d",&x,&y);

    for(int j=1;j<=M;j++)
    {
            result+=(array[x][j]*array[y][j]);
    }
    printf("%d",result);
}
