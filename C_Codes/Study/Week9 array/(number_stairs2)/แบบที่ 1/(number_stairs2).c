#include <stdio.h>
void main()
{
    int N;
    int array[501];
    int star=1;
    int i=0;
    int o=0;
    for(;;)
    {
        scanf("%d",&N);
        if(N<0 || N>9)
        {
            break;
        }
        array[i]=N;
        i+=1;
    }

    for(int row=0;row<=i-1;row++)
    {
        for(int space=0;space<(i-star);space++)
        {
            printf(" ");
        }
        for(int i=0;i<star;i++)
        {
            printf("%d",array[o]);
        }
        star+=1;
        o+=1;
        printf("\n");
    }

}
