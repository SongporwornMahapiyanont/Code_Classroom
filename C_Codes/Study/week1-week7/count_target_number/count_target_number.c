#include <stdio.h>


void main()

{
    int inputnumber;
    int a = 0,X;

    scanf("%d",&X);

    while(1)
    {
        scanf("%d",&inputnumber);
        if(inputnumber==0 )
        {
            break;
        }
        else
        {
            if(inputnumber==X)
            {
               a = a+1;
            }

        }

    }

    if(a>0)
    {
        printf("%d",a);
    }
    else
    {
        printf("None");
    }


}
