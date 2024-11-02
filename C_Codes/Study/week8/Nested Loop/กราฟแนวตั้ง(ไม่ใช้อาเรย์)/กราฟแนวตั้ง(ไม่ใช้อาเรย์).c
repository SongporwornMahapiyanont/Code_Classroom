#include <stdio.h>
#include <limits.h>
void main()
{
    int max = INT_MIN;
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);
    if(x>max)
    {
        max = x;
    }
    if(y>max)
    {
        max = y;
    }
    if(z>max)
    {
        max = z;
    }

    for(int row=1;row<=max;row+=1)
    {
        if(row > max-x)
        {
            printf("* ");
        }
        else
        {
            printf("  ");
        }
        if(row > max-y)
        {
            printf("* ");
        }
        else
        {
            printf("  ");
        }
        if(row > max-z)
        {
            printf("* ");
        }
        else
        {
            printf("  ");
        }
        printf("\n");
    }
}
