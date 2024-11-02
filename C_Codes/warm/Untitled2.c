#include <stdio.h>

struct student
{
    char ID[9];
    char surname[100];
    char lastname[100];
    float GPA;
}typedef STUDENT;

void main()
{
    int i,best=0;
    float max=-20000000;
    scanf("%d",&i);
    STUDENT N[i+1];
    for(int j=1;j<=i;j++)
    {
        scanf("%s",N[j].ID);
        scanf("%s",N[j].surname);
        scanf("%s",N[j].lastname);
        scanf("%f",&N[j].GPA);
        if(N[j].GPA > max)
        {
            max = N[j].GPA;
            best = j;
        }
    }
    printf("%s ",N[best].ID);
    printf("%s ",N[best].surname);
    printf("%s ",N[best].lastname);
    printf("%.2f",N[best].GPA);
}
