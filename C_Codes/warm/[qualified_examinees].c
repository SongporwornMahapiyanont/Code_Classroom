#include <stdio.h>
struct person
{
    char ID[6];
    float score;

}typedef PERSON;

void main()
{
    int N;
    float count=0;
    scanf("%d",&N);
    PERSON p[N];
    for(int i=0;i<N;i++)
    {
        scanf("%s",p[i].ID);
        scanf("%f",&p[i].score);
        count+=p[i].score;
    }
    float avg=count/N;
    int amount=0;
    for(int i=0;i<N;i++)
    {
        if(p[i].score>=avg)
        {
            amount+=1;
        }
    }
    printf("%d\n",amount);
    for(int i=0;i<N;i++)
    {
        if(p[i].score>=avg)
        {
            printf("%s\n",p[i].ID);
        }
    }


}
