#include <stdio.h>
int array[10000];
int count[10000];
void main()
{
    int N;
    double amount=0;
    scanf("%d",&N);
    for(int i=0;i<10000;i++)
    {
        count[i]=0;
    }
    for(;;)
    {
        int input;
        scanf("%d",&input);
        if(input==0)
        {
            break;
        }
        amount+=1;
        if(array[input]=input)
        {
            count[input]+=1;
        }
        else
        {
            array[input]=input;
        }
    }

    for(int i=1;i<=N;i++)
    {
        double avg =(count[i]/amount)*100;
        printf("%.2lf%%\n",avg);
        avg=0;
    }

}
