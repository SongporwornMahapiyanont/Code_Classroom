#include <stdio.h>

int main()
{
    int x,y;
    scanf("%d %d",&x,&y);
    if(x<=y)
    {
        for(int i=2;i<=y;i++)
        {
            printf("%d ",i);
        }
    }
    else
    {
        printf("Invalid input");
    }
}
