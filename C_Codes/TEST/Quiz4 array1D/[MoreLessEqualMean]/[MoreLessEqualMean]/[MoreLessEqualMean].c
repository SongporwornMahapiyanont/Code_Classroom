#include <stdio.h>
int array[50000];
void main()
{
    int N;
    int num1=0,num2=0,num=0;
    int sum=0;
    scanf("%d",&N);
    for(int i=0;i<50000;i++)
    {
        array[i]=0;
    }
    for(int i=0;i<N;i++)
    {
        int input;
        scanf("%d",&input);
        array[i]=input;
        sum+=input;
    }
    int avg = sum/N;

    for(int j=0;j<N;j++)
    {
        if(array[j]>avg)
        {
            num1+=1;
        }
        else if(array[j]<avg)
        {
            num2+=1;
        }
        else
        {
            num+=1;
        }
    }
    printf("%d\n",avg);
    printf("%d %d %d",num1,num2,num);

}
