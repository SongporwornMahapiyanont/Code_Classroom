#include <stdio.h>

int main()
{
    int input,nine,amountnine=0;
    int i=1;

    scanf("%d",&input);

    for(i=1;i<=1000000000;i*=10)
    {
        nine=(input/i)%10;
        if(nine==9)
        {
            printf("SATHU ");
            amountnine+=1;
        }
    }
    if(amountnine == 9)
    {
        printf("OHH! Serious SATHU\n");
    }
    if(amountnine ==0)
    {
        printf("Hope to find SATHU next time\n");
    }
    return 0;
}
