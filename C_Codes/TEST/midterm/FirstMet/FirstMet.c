#include <stdio.h>

void main()
{
    int X,Y;
    int a1;
    scanf("%d %d",&X,&Y);
    while(1)
    {
        scanf("%d",&a1);
                if(a1%X==0 && a1%Y==0)
                {
                    printf("%d\n",a1);
                    printf("2");
                    break;
                }
                else if(a1%X==0)
                {
                    printf("%d\n",a1);
                    printf("0");
                    break;
                }
                else if(a1%Y==0)
                {
                    printf("%d\n",a1);
                    printf("1");
                    break;
                }
                if(a1<0)
                {
                    printf("%d\n",a1);
                    break;
                }
    }


}

