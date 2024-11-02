#include <stdio.h>
typedef struct
{
    char ID[9];
    char name[31];
    char surname[51];
    int year;

}PERSON;
void main()
{
    int N;
    scanf("%d",&N);
    PERSON p[N];
    int best;
    for(int i=0;i<N;i++)
    {
        scanf("%s",p[i].ID);
        scanf("%s",p[i].name);
        scanf("%s",p[i].surname);
        scanf("%d",&p[i].year);
    }
    int Y,count=0;
    scanf("%d",&Y);
    for(int i=0;i<N;i++)
    {
        if(p[i].year==Y)
        {
            printf("%s ",p[i].ID);
            printf("%s ",p[i].name);
            printf("%s ",p[i].surname);
            printf("\n");
            count+=1;
        }
    }
    if(count==0)
    {
        printf("None");
    }
}
