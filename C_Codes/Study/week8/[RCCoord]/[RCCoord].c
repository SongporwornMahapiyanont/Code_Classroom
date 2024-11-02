#include <stdio.h>

void main()
{
    int R,C;
    scanf("%d %d",&R,&C);
    for(int x=0;x<=R;x++)
    {
        for(int y=0;y<=C;y++)
        {
            printf("(%d, %d) ",x,y);
        }
        printf("\n");
    }

}
