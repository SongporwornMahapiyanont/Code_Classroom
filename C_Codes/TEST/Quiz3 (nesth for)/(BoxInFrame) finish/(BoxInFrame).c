#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);


    for(int col=0;col<N;col++)
    {
        printf("*");
    }
    printf("\n");
    printf("*");

    for(int col=1;col<=N-2;col++)
    {
        printf(" ");
    }
    printf("*");
    printf("\n");

    for(int row=2;row<N-2;row++)
    {
        printf("* ");
        for(int col=3;col<=N-2;col++)
        {
            printf("*");
        }
        printf(" *\n");
    }

    printf("*");
    for(int col=1;col<=N-2;col++)
    {
        printf(" ");
    }
    printf("*");
    printf("\n");

    for(int col=0;col<N;col++)
    {
        printf("*");
    }
    printf("\n");
}
