#include <stdio.h>
int main()
{
   int i=0,N;
   float weight,height,BMI;
   float people1=0,people2=0,people3=0,people4=0;
   float perpeople1=0,perpeople2=0,perpeople3=0,perpeople4=0;
   float allper1,allper2,allper3,allper4;
    scanf("%d",&N);
   for(i=0;i<N;i++)
   {
       scanf("%f%f",&weight,&height);
       height = height/100;
       BMI = weight/(height*height);
        if(BMI<18.5)
        {
            people1+=1;
            perpeople1+=weight;
        }
        else if(BMI<25)
        {
            people2+=1;
            perpeople2+=weight;
        }
        else if(BMI<30)
        {
            people3+=1;
            perpeople3+=weight;
        }
        else if(BMI>=30)
        {
            people4+=1;
            perpeople4+=weight;
        }

   }
    perpeople1 = perpeople1/people1;
    perpeople2 = perpeople2/people2;
    perpeople3 = perpeople3/people3;
    perpeople4 = perpeople4/people4;


    allper1 = (people1/N)*100;
    allper2 = (people2/N)*100;
    allper3 = (people3/N)*100;
    allper4 = (people4/N)*100;

    printf("Underweight %.0f %.2f %.2f%%\n",people1,perpeople1,allper1);
    printf("Normal weight %.0f %.2f %.2f%%\n",people2,perpeople2,allper2);
    printf("Overweight %.0f %.2f %.2f%%\n",people3,perpeople3,allper3);
    printf("Obesity %.0f %.2f %.2f%%",people4,perpeople4,allper4);
    return 0;
}
