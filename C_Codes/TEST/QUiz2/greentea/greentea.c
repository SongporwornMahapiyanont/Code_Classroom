#include <stdio.h>

void main()
{
    int sugar,water,bottle,bottlewater,bottlesugar;
    int i=0,N=7;
    int left,leftwater;
    while(i<N)
    {
        scanf("%d %d",&water,&sugar);
        bottlewater = water/250;
        bottlesugar = sugar/15;

        if(bottlewater >= bottlesugar)
        {
            bottle = bottlesugar;
        }
        else if(bottlewater <= bottlesugar)
        {
            bottle = bottlewater;
        }

        leftwater = water-(bottle*250);
        if(leftwater !=0 )
        {
            printf("%d water\n",bottle);
        }
        else
        {
            printf("%d\n",bottle);
        }
        i+=1;
    }

}
