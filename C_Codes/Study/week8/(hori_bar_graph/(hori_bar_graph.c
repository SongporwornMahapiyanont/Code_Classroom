#include <stdio.h>
void main()
{
    int input;
    for(;;)
    {
        scanf("%d",&input);
        if(input<=0)
        {
            break;
        }
        else
        {
            for(int col=1;col<=input;++col)
            {
                printf("*");
            }
            printf("\n");
        }
    }
}
