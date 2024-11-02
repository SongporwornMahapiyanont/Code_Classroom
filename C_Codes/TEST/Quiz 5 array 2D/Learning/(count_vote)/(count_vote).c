#include <stdio.h>
void main()
{
    int N,K,count=0;
    int max=-20000000,best=-2000000;
    scanf("%d %d",&N,&K);
    int array[101];
    for(int i=0;i<=100;i++)
    {
        array[i]=0;
    }
    for(int i=1;i<=K;i++)
    {
        int input;
        scanf("%d",&input);
        array[input]=array[input]+1;
    }
    for(int i=1;i<=N;i++)
    {
        if(array[i]>max)
        {
            max = array[i];
            best = i;
        }
    }
    printf("%d\n",best);
    printf("%d",max);
}
