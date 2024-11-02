#include <stdio.h>

void main()
{
    int X,a;
    int i=0,N=8;
    int distance,lessDistance=999999999,result;

    scanf("%d",&X);

    while(i<N)
    {
        scanf("%d",&a);

            if(a>X)
            {
                distance = a-X;

            }
            if(a<X)
            {
                distance = X-a;
            }

            if(lessDistance>=distance)
            {
                lessDistance=distance;
                result=a;

            }
        i+=1;
    }

    printf("%d",result);



}
