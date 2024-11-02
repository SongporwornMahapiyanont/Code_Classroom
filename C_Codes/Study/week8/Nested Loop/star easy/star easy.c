#include <stdio.h>

void main ()
{
   int i,j,N=5;
   for(int i=1;i<=N;i+=1)
   {
        for(int j=1;j<=i;j+=1)
        {
            printf("*");
        }
        printf("\n");
   }



}
