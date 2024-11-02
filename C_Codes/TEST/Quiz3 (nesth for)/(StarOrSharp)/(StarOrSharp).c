#include <stdio.h>
void main()
{
    int N;
    int x;
    scanf("%d",&N);

    for(int i=0;i<N;i++)
    {
        scanf("%d",&x);
        if(x%2==0)
        {
            for(int star=0;star<x;star++)
            {
                printf("#");
            }
            printf("\n");
        }
        else if(x%2!=0)
        {
            for(int star=0;star<x;star++)
            {
                printf("*");
            }
            printf("\n");
        }
    }
}
