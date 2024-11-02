#include <stdio.h>
void main()
{
    int N,count=0;
    scanf("%d",&N);

    int freq[N],count_freq[N];

    for(int i=0;i<N;i++)
    {
        freq[i]=0;
        count_freq[i]=0;
    }

    int order[N];

    for(int i=0;i<N;i++)
    {
        scanf("%d",&order[i]);
        for(int j=0;j<N;j++)
        {
            if(order[i]!=freq[j] && freq[j]==0)
            {
                freq[j]=order[i];
                count+=1;
            }
            if(order[i]==freq[j])
            {
                count_freq[j]+=1;
                break;
            }
        }
    }
    printf("%d\n",count);
    for(int i=0;i<count;i++)
    {
        printf("%d %d\n",freq[i],count_freq[i]);
    }
}
