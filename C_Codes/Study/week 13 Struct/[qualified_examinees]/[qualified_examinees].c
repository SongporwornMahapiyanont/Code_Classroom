#include <stdio.h>
typedef struct
{
    char ID[6];
    int score;
}PERSON;
void main()
{
    int count=0;
    int N;
    scanf("%d",&N);
    PERSON p[N+1];
    for(int i=1;i<=N;i++)
    {
        scanf("%s",p[i].ID);
        scanf("%d",&p[i].score);
        count+=p[i].score;
    }

    double avg = (double)count/N; //key//

    int people_count=0;
    for(int i=1;i<=N;i++)
    {
        if(p[i].score>=avg)
        {
            people_count+=1;
        }
    }
    printf("%d\n",people_count);
    for(int i=1;i<=N;i++)
    {
        if(p[i].score>=avg)
        {
            printf("%s \n",p[i].ID);
        }
    }

}
