#include <stdio.h>
typedef struct
{
    int age;
    int year;
    double gpa
}PERSON;
void main()
{
    ///plan1////
    int x=5;
    PERSON p1,p2;
    p1.age = 19;
    p1.year = 1;
    p1.gpa = 3.1;
    printf("%d %d %.2f\n",p1.age,p1.year,p1.gpa);


    scanf("%d%d%lf",&p2.age,&p2.year,&p2.gpa);
    printf("%d %d %.2lf",p2.age,p2.year,p2.gpa);
    /////////////
    ////PLAN2//////
    PERSON p_array[0].age=20;
    PERSON p_array[0].year=2;
    PERSON p_array[0].gpa=3.0;

    for(int i=0;i<N;i++)
    {
        scanf("%d %d %lf",&p_array[i].age,&p_array[i].year,&p_array[i].gpa);
    }
}
