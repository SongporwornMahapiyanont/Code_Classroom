#include <stdio.h>
int array[1000000];
int a[1000000];
void main()
{
    int input,N=0,count=0,num=1;
    for(int i=0;i<1000000;i++)
    {
        array[i]=0;
        a[i]=0;
    }
    for(;;)
    {
        scanf("%d",&input);
        if(input<=0)
        {
            break;
        }
        if(array[input]==0)
        {
            count+=1;
            a[num]=input;
            num+=1;
        }
        array[input]=1;
        N+=1;
    }

    printf("%d\n",N);
    printf("%d\n",count);
    for(int i=1;i<=count;i++)
    {
        if(a[i]!=0)
        {
            printf("%d ",a[i]);
        }
    }

}
