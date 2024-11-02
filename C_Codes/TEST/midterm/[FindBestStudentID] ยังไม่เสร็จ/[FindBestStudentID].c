#include <stdio.h>

void main()
{
    int w,x,y,z;
    int a;
    int password;
    int min = 99999999,max=-999999999;
    int total;
    while(1)
    {
            scanf("%d ",&a);
            if(a<0)
            {
                break;
            }
            scanf("%d %d %d %d",&w,&x,&y,&z);
            if(w>=0 && x>=0 && y>=0 && z>=0)
            {
                if(w<min)
                {
                    total = 0;
                    min = w;
                    total = x+y+z;
                    if(total>=max)
                    {
                        max = total;
                        password = a;
                    }
                }
                else if(x<min)
                {
                    total = 0;
                    min = x;
                    password = a;
                    total = w+y+z;
                    if(total>=max)
                    {
                        max = total;
                        password = a;
                    }
                }
                else if(y<min)
                {
                    total = 0;
                    min = y;
                    total =w+x+z;
                    if(total>=max)
                    {
                        max = total;
                        password = a;
                    }
                }
                else if(z<min)
                {
                    total = 0;
                    min = z;
                    total =w+x+y;
                    if(total>=max)
                    {
                        max = total;
                        password = a;
                    }
                }
            }
            else
            {
                break;
            }
         min = 99999999;
    }


    printf("%d\n",password);
    printf("%d",max);
}


