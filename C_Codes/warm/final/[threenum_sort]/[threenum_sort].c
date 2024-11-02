#include <stdio.h>
void main()
{
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);

    if(x<=y && x<=z)
    {
        if(y<=z)
        {
            printf("%d %d %d",x,y,z);
        }
        else
        {
            printf("%d %d %d",x,z,y);
        }
    }

    if(y<=x && y<=z)
    {
        if(x<=z)
        {
            printf("%d %d %d",y,x,z);
        }
        else
        {
            printf("%d %d %d",y,z,x);
        }
    }

    if(z<=y && z<=x)
    {
        if(y<=x)
        {
            printf("%d %d %d",z,y,x);
        }
        else
        {
            printf("%d %d %d",z,x,y);
        }
    }






}
