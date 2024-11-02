#include <stdio.h>
void main()
{
    int N;
    int star=1;
    scanf("%d",&N);
    for(int row=0;row<(N/2)+1;row++)
    {
        for(int space=0;space<(N-star)/2;space++)
        {
            printf(" ");
        }
        for(int i=0;i<star;i++)
        {
            printf("*");
        }
        printf("\n");
        star+=2;
    }
    star-=4;
    for(int row=0;row<(N/2);row++)
    {
        for(int space=0;space<(N-star)/2;space++)
        {
            printf(" ");
        }
        for(int i=0;i<star;i++)
        {
            printf("*");
        }
        printf("\n");
        star-=2;
    }
}
