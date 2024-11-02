#include <stdio.h>
void main()
{
    int A[100];
    int B[100];
    int input;
    for(int i=0;i<=99;i++)
    {
         A[i]=0;
         B[i]=0;
    }
    for(;;)
    {
        scanf("%d",&input);
        if(input<0)
        {
            break;
        }
        A[input]=1;
    }
    for(;;)
    {
        scanf("%d",&input);
        if(input<0)
        {
            break;
        }
        B[input]=1;
    }

    int check=0;
    int countA=0;
    int countB=0;

    for(int i=0;i<100;i++)
    {
        if(A[i]==1)
        {
            countA+=1;
        }
        if(B[i]==1)
        {
            countB+=1;
        }
        if(A[i]!=B[i])
        {
            check=1;
        }
    }
    if(check==0)
    {
        printf("A and B are anagrams\n");
    }
    else
    {
        printf("A and B are not anagrams\n");
    }
    printf("A %d\n",countA);
    printf("B %d\n",countB);
}
