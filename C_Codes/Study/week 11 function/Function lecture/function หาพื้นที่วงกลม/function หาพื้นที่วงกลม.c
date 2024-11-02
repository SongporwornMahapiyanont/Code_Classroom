#include <stdio.h>

double findcircle(double r)
{
    const double PI = 3.1415926535;
    return PI*r*r;
}

void main()
{
    double radain ;
    double result;
    scanf("%lf",&radain);
    result = findcircle(radain);
    printf("result = %lf",findcircle(radain));
}
