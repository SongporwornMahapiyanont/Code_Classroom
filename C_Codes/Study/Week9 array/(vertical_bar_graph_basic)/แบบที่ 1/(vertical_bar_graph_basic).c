#include <stdio.h>
#include <limits.h>
void main()
{
    int N=0;
    scanf("%d",&N);
    int arr[N];
    int MAX=INT_MIN;


    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]>MAX)
        {
            MAX=arr[i];
        }
    }

    for(int row=MAX;row>0;row--)
    {
        for(int col=0;col<N;col++)
        {
            if(arr[col]>=row)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }



        }
        printf("\n");
    }

}
