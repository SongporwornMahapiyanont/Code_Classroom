#include <stdio.h>
void main()
{
    int num;
    int x,y;
    int sum=0;
    scanf("%d",&num);
    for(;;)
    {
        x = num%10;
        y = num/10;
        sum+=x;
        if(y==0)
        {
            printf("%d\n",sum);
            if(sum<10)
            {
                break;
            }
            else
            {
                num=sum;
                sum=0;
            }
        }
        else
        {
            num=y;
        }
    }
    if(sum==9)
    {
        printf("SATHU");
    }
    else
    {
        printf("No SATHU");
    }



}
