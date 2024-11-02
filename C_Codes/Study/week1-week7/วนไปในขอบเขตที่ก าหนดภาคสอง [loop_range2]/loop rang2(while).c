#include <stdio.h>

int main()
{
    int x,y;
    scanf("%d %d",&x,&y);
    if(x<=y)
    {
        while(x<=y)
        {
        	printf("%d ",x);
        	x+=1;
		}
    }
    else
    {
        while(x>=y)
        {
        	printf("%d ",x);
        	x-=1;
		}
    }
}

