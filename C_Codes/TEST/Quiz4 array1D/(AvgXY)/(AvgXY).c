#include <stdio.h>
void main()
{
    int N[100000];
    int X,Y,a,amount=0;
    double sum=0;
    scanf("%d",&a);
    for(int i=0;i<a;i++)
    {
        scanf("%d",&N[i]);
    }
    scanf("%d %d",&X,&Y);
    if(X<=Y)
    {
        for(int i=X;i<=Y;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(i==N[j])
                {
                    amount+=1;
                    sum+=i;
                }
            }
        }
        if(amount==0)
        {
            printf("%d\n",amount);
            printf("none");
        }
        else
        {
            printf("%d\n",amount);
            printf("%.2lf",sum/amount);
        }
    }
}
