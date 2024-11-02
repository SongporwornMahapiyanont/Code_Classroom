#include <stdio.h>
void main()
{
    int N;
    int space=0;
    int num=0;
    scanf("%d",&N);
    int n=N;
    for(int row=0;row<N;row++)
    {
        num = n%10;
        for(int s=0;s<space;s++)
        {
            printf(" ");
        }
        for(int i=n;i>0;i--)
        {
            printf("%d",num);
        }
        printf("\n");
        space++;
        n--;
    }

}
