#include <stdio.h>
#include <limits.h>
void main()
{
    int N;
    int MAX=INT_MIN;
    scanf("%d",&N);
    int array[N];

    for(int i=0;i<N;i++)
    {
        scanf("%d",&array[i]);
        if(array[i]>MAX)
        {
            MAX = array[i];
        }
    }
    int max=MAX;
    for(int row=0;row<MAX;row++)
    {
        for(int col=0;col<N;col++)
        {
            if(array[col]>=max)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        max-=1;
        printf("\n");
    }
}
