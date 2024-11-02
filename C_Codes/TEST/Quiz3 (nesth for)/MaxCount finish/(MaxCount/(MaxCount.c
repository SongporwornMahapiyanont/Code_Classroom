#include <stdio.h>
void main()
{
    int K,N;
    int floor=0;
    int input;
    int amount=0;
    int max=-99999999;

    scanf("%d %d",&K,&N);
    for(int i=1;i<=N;i++)
    {
        amount=0;
        for(;;)
        {
            scanf("%d",&input);
            if(input==0)
            {
                break;
            }
            if(input%K==0 && input>0)
            {
                amount+=1;
                if(amount>=max)
                {
                    max=amount;
                    floor=i;
                }
            }
        }
    }
    printf("%d %d",floor,max);

}
