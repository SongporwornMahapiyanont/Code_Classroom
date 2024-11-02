#include <stdio.h>
void main()
{
    int K;
    int input;
    int amount=0;
    int amount1=0;
    int sum=0;
    scanf("%d",&K);
    for(;;)
    {
        scanf("%d",&input);
        if(input==0)
        {
            break;
        }
        amount+=1;
        if(input%K==0 && input>0)
        {
            amount1+=1;
            sum+=input;
        }
    }
    printf("%d\n",amount);
    printf("%d\n",amount1);
    printf("%d\n",sum);
}
