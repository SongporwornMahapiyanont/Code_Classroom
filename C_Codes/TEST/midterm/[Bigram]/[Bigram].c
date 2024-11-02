#include <stdio.h>
 void main()
 {
     int input,input2;
     int situation1=0,situation2=0,situation3=0,situation4=0;
     scanf("%d",&input);
     while(1)
     {
         scanf("%d",&input2);
         if(input != 0 && input != 1)
         {
             break;
         }
         if(input2 != 0 && input2 != 1)
         {
             break;
         }
         if( input == 0 )
         {
             if(input2 == 0)
             {
                situation1+=1;
             }
             else if(input2 == 1)
             {
                situation2+=1;
             }
         }
        if( input == 1 )
         {
             if(input2 == 0)
             {
                situation3+=1;
             }
             else if(input2 == 1)
             {
                situation4+=1;
             }
         }
         input = input2;
     }
    printf("%d\n",situation1);
    printf("%d\n",situation2);
    printf("%d\n",situation3);
    printf("%d\n",situation4);
 }
