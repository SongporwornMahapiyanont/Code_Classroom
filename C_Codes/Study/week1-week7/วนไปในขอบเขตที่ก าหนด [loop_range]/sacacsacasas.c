#include <stdio.h>

void main()

{
    int x,y;
    scanf("%d %d",&x,&y);

    if(x<y)
    {
        while(x<y)
        {
            printf("%d ",x);
            x+=1;
        }
        printf("%d",y);

    }
    else if(x>y)
    {
        printf("Invalid input\n");
    }
    else
    {

    }

}


