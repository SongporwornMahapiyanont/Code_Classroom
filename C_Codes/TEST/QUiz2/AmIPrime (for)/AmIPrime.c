#include <stdio.h>
 int main()
 {
     int input,i=1,amount=0;
     scanf("%d",&input);
     for(i=1;i<=input;i++)
     {
         if(input%i==0)
         {
             amount+=1;
         }
     }
     if(amount==2)
     {
         printf("%d is prime",input);
     }
     else
     {
        printf("%d is not prime",input);
     }
    return 0;
 }
