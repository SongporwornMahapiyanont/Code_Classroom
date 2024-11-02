#include <stdio.h>
void main()
{
    float count=0,count_pass=0;
    float count_float=0;
    int M,N;
    scanf("%d %d",&M,&N);
    int p[N+1][M+1];
    int num_pass[M+1];

    for(int i=1;i<=N;i++)
    {
        for(int j=1;j<=M;j++)
        {
            scanf("%d",&p[i][j]);
        }
    }

    for(int i=1;i<=M;i++)
    {
        for(int j=1;j<=N;j++)
        {
            printf("%d ",p[j][i]);
            count+=p[j][i];
            count_float+=p[j][i];
        }
        printf("%.0f",count);
        printf("\n");
        count=0;
    }
    printf("average = %.2f\n",count_float/M);
    for(int i=1;i<=M;i++)
    {
        for(int j=1;j<=N;j++)
        {
            count+=p[j][i];
        }
        if(count>=count_float/M)
        {
            count_pass+=1;
            num_pass[i]=i;
        }
        count=0;
    }
    printf("pass %.0f\n",count_pass);
    for(int i=1;i<=M;i++)
    {
        if(num_pass[i]!=0 && num_pass[i]<=M && num_pass[i]>=1)
        {
            printf("%d ",num_pass[i]);
        }
    }
}
