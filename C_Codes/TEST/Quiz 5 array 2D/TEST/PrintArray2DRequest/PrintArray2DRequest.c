#include <stdio.h>
void main()
{
    int R,C,N;
    int max=-20000000,min=20000000;
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
    int count=0;
    scanf("%d %d",&R,&C);
    for(int row=1;row<=N;row+=R)
    {
        for(int col=1;col<=N;col+=C)
        {
            printf("%d ",array[row][col]);
            count+=1;
            if(array[row][col]>max)
            {
                max = array[row][col];
            }
            if(array[row][col]<min)
            {
                min = array[row][col];
            }
        }
        printf("\n");
    }
    printf("%d\n",count);
    printf("%d\n",max);
    printf("%d",min);
}
