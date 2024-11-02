#include <stdio.h>

int main()
{
    int N,dayA=0,dayB=0,dayC=0;
    int input,i=0.;
    scanf("%d",&N);
    for(i=0;i<N;i++)
    {
        scanf("%d",&input);
        if(dayA<=dayB && dayA<=dayC)
        {
            printf("A\n");
            dayA+=input;
        }
        else if(dayB<=dayA && dayB<=dayC)
        {
            printf("B\n");
            dayB+=input;
        }
        else if(dayC<=dayB && dayC<=dayA)
        {
            printf("C\n");
            dayC+=input;
        }

    }


    return 0;
}
