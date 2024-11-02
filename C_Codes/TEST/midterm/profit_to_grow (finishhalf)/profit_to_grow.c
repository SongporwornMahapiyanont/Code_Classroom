#include <stdio.h>

void main()
{
    int N,K;
    int income,expenses;
    int INCOME=0,EXPENSES=0;
    int wait=0;
    int i=0;
    int result=0;
    scanf("%d %d",&N,&K);
    while(i<N)
    {
         if(K%2==0)
        {
            scanf("%d %d",&income,&expenses);
            result+=iincome-expenses;
        }
        i+=1;
    }

    if(result > 0)
    {
        printf("Profit %d\n",result);
    }
    else if(result = 0)
    {
        printf("Breakeven\n");
    }
    else
    {
        printf("Loss %d\n",-result);
    }

    if(result>= K)
    {
        printf("Expand");
    }
    else if(result>=K/2)
    {
        printf("Wait and see\n");
    }
    else
    {
        printf("Not expand");
    }


}
