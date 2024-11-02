#include <stdio.h>
void main()
{
    int max=-20000000,min=20000000,mid;
    int A,B,C;
    scanf("%d %d %d",&A,&B,&C);

    if(A>=max)
    {
        max=A;
    }
    if(B>=max)
    {
        max=B;
    }
    if(C>=max)
    {
        max=C;
    }


    if(A<=min)
    {
        min=A;
    }
    if(B<=min)
    {
         min=B;
    }
    if(C<=min)
    {
        min=C;
    }




    if(A>min && A<max)
    {
        mid=A;
    }
    if(B>min && B<max)
    {
        mid=B;
    }
    if(C>min && C<max)
    {
        mid=C;
    }

    printf("%d %d %d",min,mid,max);
}
