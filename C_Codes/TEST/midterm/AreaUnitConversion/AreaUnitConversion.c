#include <stdio.h>

void main()
{
    int intput;
    int r,w;
    int result,result2;
    scanf("%d %d",&r,&w);

    result = w/400;
    r=r+result;
    result2 = w-(result*400);

    if(r != 0 )
    {
        printf("%d r ",r);
    }
    if(result2 != 0 )
    {
        printf("%d w",result2);
    }
}
