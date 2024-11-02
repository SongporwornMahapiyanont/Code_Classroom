#include <stdio.h>
void main()
{
   int N;
   scanf("%d",&N);
   int array1[N],array2[N];
   int sum1=0,sum2=0;
    for(int row=0;row<1;row++) //input//
    {
        for(int col=0;col<N;col++)
        {
            scanf("%d",&array1[col]);
        }
        for(int col=0;col<N;col++)
        {
            scanf("%d",&array2[col]);
        }
    }

    for(int i=0;i<N;i++) //math//
    {
        if(array1[i]==1 && array2[i]==3)
        {
            sum1+=1;
        }
        else if(array2[i]==1 && array1[i]==3)
        {
            sum2+=1;
        }
        else if(array1[i]>array2[i])
        {
            sum1+=1;
        }
        else if(array2[i]>array1[i])
        {
            sum2+=1;
        }
    }

    printf("%d %d\n",sum1,sum2);
    if(sum1>sum2)
    {
        printf("1\n");
    }
    else if(sum2>sum1)
    {
        printf("2\n");
    }
    else
    {
        printf("0\n");
    }
}
