#include <stdio.h>
void main()
{   int sum=0;
    for(int amount=0;amount<7;++amount)
    {
        for(int i=0;i<3;++i)
        {
            sum=sum+1;
        }
        printf("%d ",sum);
    }
}
