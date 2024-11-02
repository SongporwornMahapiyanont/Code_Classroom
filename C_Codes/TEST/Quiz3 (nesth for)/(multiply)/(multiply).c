#include <stdio.h>
void main()
{
    int start,stop,input;
    scanf("%d %d %d",&start,&stop,&input);

    if(start<stop)
    {
        for(int i=start;i<=stop;i++)
        {
            printf("%d: ",i);
            for(int num=1;num<=input;num++)
            {
                printf("%d ",i*num);
            }
            printf("\n");
        }
    }
    else if(start>stop)
    {
        for(int i=stop;i<=start;i++)
        {
            printf("%d: ",i);
            for(int num=1;num<=input;num++)
            {
                printf("%d ",i*num);
            }
            printf("\n");
        }
    }
}
