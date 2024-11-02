#include <stdio.h>

int findcan(int x, int y)
{
    if(x/3 < y/2)
    {
        return x/3;
    }
    else
    {
        return y/2;
    }

}
void main()
{
    int input,input1;
    int result;
    scanf("%d%d",&input,&input1);
    result = findcan(input,input1);
    printf("result = %d",result);



}
