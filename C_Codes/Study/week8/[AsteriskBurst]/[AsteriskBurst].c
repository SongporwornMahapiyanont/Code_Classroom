#include <stdio.h>

void main()
{
    int R,C;
    scanf("%d %d",&R,&C);
    for(int row=1;row<=R;++row)
    {
        for(int col=1;col<=C;++col)
        {
            printf("*");
        }
        printf("\n");
    }



}
