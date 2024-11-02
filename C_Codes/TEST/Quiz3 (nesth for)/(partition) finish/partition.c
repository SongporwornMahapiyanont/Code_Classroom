#include <stdio.h>
void main()
{
    int W,N;
    scanf("%d%d",&W,&N);

    for(int j=0;j<N;j++)
    {
        printf("*");
        for(int i=0;i<W;i++)
        {
            printf("*");
        }
    }
    printf("*");
    printf("\n");
    for(int i=0;i<=N;i++)
    {
        printf("*");
        for(int space=0;space<W;space++)
        {
            printf(" ");
        }
    }
    printf("\n");
    for(int j=0;j<N;j++)
    {
        printf("*");
        for(int i=0;i<W;i++)
        {
            printf("*");
        }
    }
    printf("*");
    printf("\n");
}
