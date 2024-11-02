#include <stdio.h>

void main()
{
    int a1,a2,a3,a4,a5,a6;
    int N;
    int total;

    scanf("%d %d %d %d",&a1,&a2,&a3,&a4);
    total = a1+a2+a3+a4;
    scanf("%d",&N);
    N=N-4;

    for(int i=0;i<N;i+=1)
    {
        a5 = (a1+a3)*5/4;
        if(a5%2!=0)
        {
            a5 = a5*(-1);
        }
        a1=a2;
        a2=a3;
        a3=a4;
        a4=a5;
        total+=a5;
    }
    printf("%d",total);
}
