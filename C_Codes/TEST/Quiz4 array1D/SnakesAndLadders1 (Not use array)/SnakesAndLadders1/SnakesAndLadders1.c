#include <stdio.h>
void main()
{
    int nStep;
    int input;
    scanf("%d",&nStep);
    printf("A ");
    for(int i=0;i<nStep;i++)
    {
        printf("0 ");
    }
    printf("\n");
    int sum=0;
    for(;;)
    {
        scanf("%d",&input);
        sum+=input;
        if(sum>nStep)
        {
            sum=nStep;
        }
        printf("X ");
        for(int i=1;i<=nStep;i++)
        {
            if(sum==i)
            {
                printf("A ");
            }
            else
            {
                printf("0 ");
            }
        }
        printf("\n");
        if(sum==nStep)
        {
            break;
        }
    }

}
