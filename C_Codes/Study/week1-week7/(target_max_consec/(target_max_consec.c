#include <stdio.h>


void main()

{
    int x,y;
    int i=0,N=0,max=-99999999999;
    scanf("%d",&x);
    while(1)
    {
        scanf("%d",&y);
        if(y==0)
        {
            break;

        }
        else if(y==x)
        {
            i+=1;
            N+=1;
        }
        else
        {
            N = 0;
        }
        if(N>=max)
        {
            max = N;
        }




    }
    printf("%d\n",max);
    printf("%d\n",i);

}
