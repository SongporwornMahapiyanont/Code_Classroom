#include <stdio.h>
void main()
{
    int R,C;
    scanf("%d %d",&R,&C);
    int array[R][C];
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            scanf("%d",&array[i][j]);
        }
    }

    for(int i=0;i<C;i++)
    {
        for(int j=0;j<R;j++)
        {
            printf("%d ",array[j][i]);
        }
        printf("\n");
    }

}
