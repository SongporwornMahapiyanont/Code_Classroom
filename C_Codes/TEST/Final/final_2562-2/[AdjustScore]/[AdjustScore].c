#include <stdio.h>
void main()
{
    int N;
    double MAX,X;
    scanf("%d",&N);
    int array[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
    }
    scanf("%lf %lf",&MAX,&X);

    for(int i=0;i<N;i++)
    {
        printf("%.1f ",array[i]*(X/MAX));
    }
}
