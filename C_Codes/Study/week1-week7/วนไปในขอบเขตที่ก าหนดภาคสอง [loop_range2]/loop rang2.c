#include <stdio.h>

int main()
{
    int x,y;
    scanf("%d %d",&x,&y);
    if(x<=y)
    {
        for(int i=x;i<=y;i++)
        {
            printf("%d ",i);
        }
    }
    else
    {
        for(int i=x;i>=y;i-=1)
        {
            printf("%d ",i);
        }
    }
}

