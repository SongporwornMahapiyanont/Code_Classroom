#include <stdio.h>
void main()
{   int x,y,z;
    int result=0;

    scanf("%d %d",&x,&y);
    if(x!=y)
    {
        while(1)
        {
            scanf("%d",&z);
            if(x>=z && z>=y)
            {
                    result+=z;

            }
            else if(z>=x && y>=z)
            {
                    result+=z;

            }
            else if(z<=0)
            {
                break;
            }
        }
         printf("%d",result);
    }
}


