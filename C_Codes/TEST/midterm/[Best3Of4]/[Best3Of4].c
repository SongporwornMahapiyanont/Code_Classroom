#include <stdio.h>

void main()
{
    int w,x,y,z;
    int min = 99999999;
    int total;
    scanf("%d %d %d %d",&w,&x,&y,&z);

    if(w<=min)
    {
        min = w;
        total = x+y+z;
    }
    if(x<=min)
    {
        total = 0;
        min = x;
        total = w+y+z;
    }
    if(y<=min)
    {
        total = 0;
        min = y;
        total =w+x+z;
    }
    if(z<=min)
    {
        total = 0;
        min = z;
       total =w+x+y;
    }


    printf("%d",total);
}
