#include <stdio.h>
void main()
{
    for(;;)
    {
        int input;
        scanf("%d",&input);
        if(input<0)
        {
            break;
        }
        for(int i=0;i<input;i++)
        {
            printf("*");
        }
        printf("\n");

    }



}
