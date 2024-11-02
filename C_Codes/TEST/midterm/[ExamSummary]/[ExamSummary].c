#include <stdio.h>
 void main()
 {
     int input,input2;
     int amount1=0,amount2=0,amount3=0,amount4=0;
     scanf("%d",&input);
     while(1)
     {
        scanf("%d",&input2);
        if(input = 0 && input2 == 0)
        {
            amount1+=1;
        }
        else if(input = 0 && input2 == 1)
        {
            amount2+=1;
        }
        else if(input = 1 && input2 == 0)
        {
            amount3+=1;
        }
        else if(input = 1 && input2 == 1)
        {
            amount4+=1;
        }

        input = input2



        if(input2 != 0)
        {
            break;
        }
     }
    printf("%d\n",amount1);
    printf("%d\n",amount2);
    printf("%d\n",amount3);
    printf("%d\n",amount4);
 }
