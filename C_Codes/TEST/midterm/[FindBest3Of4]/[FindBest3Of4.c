#include <stdio.h>

void main()
{
    int w,x,y,z;
    int min = 99999999,max=-999999999;
    int total;
    while(1)
    {
        scanf("%d %d %d %d",&w,&x,&y,&z);
        if(w<0)
        {
            break;
        }
        if(w<=min)
        {
            total = 0;
            min = w;
            total = x+y+z;
            if(total>=max)
            {
                max = total;
            }
        }
        if(x<=min)
        {
            total = 0;
            min = x;
            total = w+y+z;
            if(total>=max)
            {
                max = total;
            }
        }
        if(y<=min)
        {
            total = 0;
            min = y;
            total =w+x+z;
            if(total>=max)
            {
                max = total;
            }
        }
        if(z<=min)
        {
            total = 0;
            min = z;
            total =w+x+y;
            if(total>=max)
            {
                max = total;
            }
        }
        min = 99999999;
    }
    printf("%d",max);
}
