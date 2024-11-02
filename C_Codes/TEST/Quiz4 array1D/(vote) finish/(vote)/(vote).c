#include <stdio.h>
void main()
{
    int N,K;
    scanf("%d%d",&N,&K);
    int max=-20000000,best=-20000000;
    int array[101];
    for(int i=1;i<=N;i++)
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
            best=i;
            max=array[i];
        }
    }
    printf("%d\n",best);
    printf("%d",max);

}
