#include <stdio.h>
void main()
{
    int exp,power=1;
    scanf("%d",&exp);
    for(int i=0;i<exp;i+=1)
    {
        power*=10;
    }
    printf("%d",power);
}
