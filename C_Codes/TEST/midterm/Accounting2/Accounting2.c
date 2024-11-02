#include <stdio.h>

void main()
{
    int input;
    int type;
    int result=0,result2=0,allresult;
    while(1)
    {
        scanf("%d",&type);
        scanf("%d",&input);
        if(type==0 && input==0)
        {
            break;
        }
        if(type == 1)
        {
            result+=input;
        }
        else if(type == 2)
        {
            result2+=input;
        }
    }
    allresult = result-result2;
    if(result >= result2)
    {
        printf("Good\n");
        printf("%d",allresult);
    }
    else if(result2 > result)
    {
        printf("Bad\n");
        printf("%d",allresult*(-1));
    }
}
