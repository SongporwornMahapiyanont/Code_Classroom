#include <stdio.h>
void main()
{
    int N,count=0;
    scanf("%d",&N);
    int array[N];
    for(int i=0;i<N;i++)
    {
        array[i]=0;
    }
    for(int i=0;i<N;i++)
    {
        int input;
        scanf("%d",&input);
        array[i]=input;
    }
    for(int i=0;i<N;i++)
    {
        if(array[i-1]==1 && array[i+1]==1)
        {
            printf("index : %d",i+1);
            printf(" = %d[",array[i]);
            for(int j=0;j<N;j++)
            {
                if(i==j)
                {
                    printf("%d ",array[i]);
                }
                else
                {
                    printf("0 ");
                }
            }
            printf("]\n");
        }
    }


}
