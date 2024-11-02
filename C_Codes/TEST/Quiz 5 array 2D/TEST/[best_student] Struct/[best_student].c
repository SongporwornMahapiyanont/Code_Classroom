#include <stdio.h>

struct student //declare and declare name//
{
    char ID[9];
    char name[100];
    char surname[100];
    float GPA;

}typedef STUDENT; //type define ___name UP___//


void main()
{
    int N,best=0;
    float max=-20000000;
    scanf("%d",&N);
    STUDENT s[N]; //declare Struct in void main and declare struct is array//
    for(int i=0;i<N;i++) //input//
    {
        scanf("%s",s[i].ID);
        scanf("%s",s[i].name);
        scanf("%s",s[i].surname);
        scanf("%f",&s[i].GPA);
        if(s[i].GPA>max)
        {
            max=s[i].GPA;
            best=i;
        }
    }
    printf("%s ",s[best].ID);
    printf("%s ",s[best].name);
    printf("%s ",s[best].surname);
    printf("%.2f",s[best].GPA);
}
