#include <stdio.h>

void main()
{
    int x,y;
    int amountx=0,amounty=0;
    int first1=0,first2=0;
    int input;
    scanf("%d %d",&x,&y);
    while(1)
    {
        scanf("%d",&input);
        if(input<=0)
        {
            printf("%d\n",amountx);
            printf("%d\n",amounty);
            break;
        }
        if(input%x==0)
        {
            amountx+=1;
        }
        if(input%y==0)
        {
            amounty+=1;
        }
    }

}

