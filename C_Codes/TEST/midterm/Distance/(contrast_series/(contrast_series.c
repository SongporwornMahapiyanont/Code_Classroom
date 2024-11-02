#include <stdio.h>

void main()
{
    int a=3;
    int b=1;
    int result=0;
    int a2,b2;
    int M,N;
    scanf("%d %d",&M,&N);
    while(a<=M)
    {
        result = result +(a*b);
        a2 = a+b;
        b2 = a-b;
        a=a2;
        b=b2;
    }
    printf("%d",result);
}
