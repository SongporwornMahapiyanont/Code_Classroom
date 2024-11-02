#include <stdio.h>
 void main()
 {
    int N,i=0;
    int input;
    int leave=0;
    int income=0;

    scanf("%d",&N);
    while(i<N)
    {
        scanf("%d",&input);
        if(input>=8)
        {
            income+=300;
            if(input == 9)
            {
                income+=50;
            }
            else if(input == 10)
            {
                income+=100;
            }
            else if(input == 11)
            {
                income+=150;
            }
            else if(input >= 12)
            {
                income+=200;
            }
            leave = 0;
        }
        else if(input>=4 && input < 8)
        {
            income+=150;
            leave = 0;
        }
        else if(input < 4)
        {
            leave+=1;
            if(leave==3)
            {
                break;
            }
        }
        i+=1;
    }
    printf("%d\n",income);


 }
