#include <stdio.h>
void main()
{
    int R,C,N;
    scanf("%d",&N);
    int array[N+1][N+1];
    for(int row=1;row<=N;row++)
    {
        for(int col=1;col<=N;col++)
        {
            int input;
            scanf("%d",&input);
            array[row][col]=input;
        }
        printf("\n");
    }
    scanf("%d %d",&R,&C);
    for(int row=1;row<=N;row+=R)
    {
        for(int col=1;col<=N;col+=C)
        {
            printf("%d ",array[row][col]);
        }
        printf("\n");
    }
}
