#include <stdio.h>

void main()
{
    double A,B,C;
    double min=99999999999,max=-9999999999;
    double mid;
    scanf("%lf %lf %lf",&A,&B,&C);
    if(A<=min)
    {
        min=A;
    }
    if(B<=min)
    {
        min=B;
    }
    if(C<=min)
    {
        min=C;
    }
    if(A >= max)
    {
        max = A;
    }
    if(B >= max)
    {
        max = B;
    }
    if(C >= max)
    {
        max = C;
    }
    if(A>min && A<max)
    {
        mid = A;
    }
    if(B>min && B<max)
    {
        mid = B;
    }
    if(C>min && C<max)
    {
        mid = C;
    }
    printf("%.0f %.0f %.0f ",min,mid,max);



}


