#include <stdio.h>
void main()
{
    int input1,input2;
    scanf("%d %d",&input1,&input2);
    if(input1==1 && input2==3)
    {
        printf("1");
    }
    else if(input2==1 && input1==3)
    {
        printf("2");
    }
    else if(input1>input2)
    {
        printf("1");
    }
    else if(input2>input1)
    {
        printf("2");
    }
    else
    {
        printf("0");
    }

}
