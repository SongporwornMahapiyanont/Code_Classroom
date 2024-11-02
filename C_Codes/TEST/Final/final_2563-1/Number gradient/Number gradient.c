#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    if(N<0)
    {
        N*=(-1);
    }
    int array[N+1][N+1];
    for(int i=1;i<=N;i++)
    {
        for(int j=1;j<=N;j++)
        {
            array[i][j]=0;
        }
    }

    for(int i=1;i<=N;i++)
    {
        for(int j=1;j<=N;j++)
        {
          if(j>=i)
          {
              if(j<10)
              {
                array[i][j]+=i;
              }
              else
              {
                  array[i][j]+=(i%10);
              }

          }
          else if(array[i][j]==0)
          {
              if(j<10)
              {
                  array[i][j]=j;
              }
              else
              {
                  array[i][j]+=(j%10);
              }
          }
          printf("%d ",array[i][j]);
        }
        printf("\n");
    }
}
