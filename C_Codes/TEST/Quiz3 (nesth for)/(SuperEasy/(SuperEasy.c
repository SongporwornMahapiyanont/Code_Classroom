#include <stdio.h>
void main()
{
    int N=0;
    int X=0,Y=0;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d %d",&X,&Y);
        if(X<=Y)
        {
             for(X;X<=Y;X++)
            {
                printf("%d ",X);
            }
            printf("\n");
        }
        else if(X>=Y)
        {
            for(Y;Y<=X;Y++)
            {
                printf("%d ",Y);
            }
            printf("\n");
        }

    }





}
