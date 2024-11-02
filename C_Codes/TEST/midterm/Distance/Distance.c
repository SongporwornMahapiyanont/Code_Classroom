 #include <stdio.h>

void main()
{
    float X,H,M;
    float distance;
    scanf("%f %f %f",&X,&H,&M);
    M = M/60;
    H = H+M;
    distance = X*H;
    if(X<0)
    {
        distance = distance*(-1);
        printf("%.1f\n",distance);
        printf("reverse");

    }
    else
    {
        printf("%.1f",distance);
    }
}

