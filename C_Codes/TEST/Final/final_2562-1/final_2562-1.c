#include <stdio.h>
void main()
{
    int N,j=0,input;
    int max_j=-20000000;
    scanf("%d",&N);
    int array[N][100];

    for(int i=0;i<N;i++)
    {
        for(;;)
        {
            scanf("%d",&input);
            if(input==0)
            {
                array[i][j+1]=0;
                break;
            }
            array[i][j]=input;
            j+=1;
            if(j>=max_j)
            {
                max_j=j;
            }
        }
        j=0;

    }
}
