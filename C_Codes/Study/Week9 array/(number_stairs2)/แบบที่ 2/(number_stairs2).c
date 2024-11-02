#include <stdio.h>
void main()
{
    int n;
    int amount=0;
    int array[501];
    int star=1;
    for(int i=0;i<501;i++)
    {
        scanf("%d",&n);
        if(n<0 || n>9)
        {
            break;
        }
        array[i]=n;
        amount++;
    }
    int am=amount-1;
    for(int row=0;row<amount;row++)
    {
        for(int space=0;space<am;space++)
        {
            printf(" ");
        }
        for(int i=0;i<star;i++)
        {
            printf("%d",array[row]);
        }
        star+=1;
        am-=1;
        printf("\n");
    }
}
