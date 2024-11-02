#include <stdio.h>
void main()
{
    int N;
    int i=0,o=0;
    scanf("%d",&N);
    int array[N];
    int array2[N];
    int input;
    int score1=0;
    int score2=0;

    for(int i=0;i<N;i++)
    {
        scanf("%d",&input);
        array[i]=input;
    }
    for(int o=0;o<N;o++)
    {
        scanf("%d",&input);
        array2[o]=input;
    }
    for(int y=0;y<N;y++)
    {
        if(array[y]>array2[y])
        {
            score1+=2;
        }
        else if(array[y]<array2[y])
        {
            score2+=2;
        }
        else
        {
            score1+=1;
            score2+=1;
        }
    }

    if(score1>score2)
    {
        printf("Team 1 wins\n");
        printf("Score %d to %d",score1,score2);
    }
    else if(score1<score2)
    {
        printf("Team 2 wins\n");
        printf("Score %d to %d",score2,score1);
    }
    else
    {
        printf("Draw game\n");
        printf("Score %d to %d",score1,score2);
    }

}
