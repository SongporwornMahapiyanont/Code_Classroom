#include <stdio.h>


void main()

{
    int inputnumber;
    int a = 0;



    while(1)
    {
        scanf("%d",&inputnumber);
        if(inputnumber==0)
        {
            break;
        }
        else
        {
            a = a+1;
        }

    }


        printf("%d",a);


}
