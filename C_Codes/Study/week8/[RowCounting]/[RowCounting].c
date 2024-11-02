#include <stdio.h>

void main()
{
    int R,C;
    scanf("%d %d",&R,&C);
    int sum=0;

    for(int row=1;row<=R;++row)
    {
        for(int col=1;col<=C;++col)
        {
            sum+=1;
            printf("%d ",sum);
        }
        printf("\n");
    }


}
