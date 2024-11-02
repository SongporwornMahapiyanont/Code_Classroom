#include <stdio.h>
void main()
{
    for(int row=1;row<=7;row++)
    {
        printf("* ");
    }
    printf("\n");
    for(int row=1;row<=6;row++)
    {
        printf("* ");
        for(int col=2;col<=6;col++)
        {
            printf("  ");
        }
        printf("*\n");
    }
    for(int row=1;row<=7;row++)
    {
        printf("* ");
    }
}
