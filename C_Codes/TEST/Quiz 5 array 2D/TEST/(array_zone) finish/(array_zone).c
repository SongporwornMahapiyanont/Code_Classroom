#include <stdio.h>
void main()
{
    int R,C;
    scanf("%d%d",&R,&C);
    int array[R][C];
    for(int row=0;row<R;row++)
    {
        for(int col=0;col<C;col++)
        {
            int input;
            scanf("%d",&input);
            array[row][col]=input;
        }

    }
    int zone1=0;
    for(int row=0;row<(R/2);row++)
    {
        for(int col=0;col<(C/2);col++)
        {
            zone1+=array[row][col];
        }
    }

    int zone2=0;
    for(int row=0;row<(R/2);row++)
    {
        for(int col=C/2;col<C;col++)
        {
            zone2+=array[row][col];
        }
    }

    int zone3=0;
    for(int row=R/2;row<R;row++)
    {
        for(int col=0;col<C/2;col++)
        {
            zone3+=array[row][col];
        }
    }

    int zone4=0;
    for(int row=R/2;row<R;row++)
    {
        for(int col=C/2;col<C;col++)
        {
            zone4+=array[row][col];
        }
    }

    printf("%d %d\n%d %d",zone1,zone2,zone3,zone4);
}
