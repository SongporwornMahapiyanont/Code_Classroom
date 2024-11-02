#include <stdio.h>

void main()

{
    int N,i=0,S=0;
    scanf("%d",&N);

    if(N>0)
    {
        while(i<N)
        {
            S=S+1;
            printf("%d\n",S);
            i+=1;
        }

    }
    else if(N<=0)
    {
        printf("Invalid input\n");
    }
    else
    {

    }

}


