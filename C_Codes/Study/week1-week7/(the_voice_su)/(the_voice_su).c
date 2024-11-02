#include <stdio.h>
int main()
{
    int i=1,N,K,K1=0,K2=0;
    int sex;
    int score1,score2;
    int God1=1,God2=2;

    scanf("%d",&N);
    scanf("%d",&K);
    while(i<=N)
    {
        scanf("%d",&sex);
        scanf("%d",&score1);
        scanf("%d",&score2);
        if(sex==1)
        {
            if(K==K1 && K==K2)
            {
                break;
            }
            if(score1>=9 && K1!=K)
            {
                printf("%d %d\n",i,God1);
                K1+=1;
            }
            else if(score2>=9 && K2!=K)
            {
                printf("%d %d\n",i,God2);
                K2+=1;
            }
        }
        else if(sex==2)
        {
            if(score2>=9 && K2!=K)
            {
                printf("%d %d\n",i,God2);
                 K2+=1;
            }
            else if(score1>=9 && K1!=K)
            {
                printf("%d %d\n",i,God1);
                 K1+=1;
            }

        }
        i+=1;
    }
    return 0;
}
