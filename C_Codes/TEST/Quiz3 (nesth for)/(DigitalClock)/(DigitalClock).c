#include <stdio.h>
void main()
{
    int start1,start2;
    int stop1,stop2;
    int nud=0;
    scanf("%d %d %d %d",&start1,&start2,&stop1,&stop2);

    for(int o=start1;o<=stop1;o++)
    {
        if(nud>=1)
        {
            if(o!=stop1)
            {
                for(int i=0;i<=59;i++)
                {
                    if(i<10)
                    {
                        printf("%d:0%d",o,i);
                        printf("\n");
                    }
                    else
                    {
                        printf("%d:%d",o,i);
                        printf("\n");
                    }
                }
            }
            else if(stop1==o)
            {

                for(int i=0;i<=stop2;i++)
                {
                    if(i<10)
                    {
                        printf("%d:0%d",o,i);
                        printf("\n");
                    }
                    else
                    {
                        printf("%d:%d",o,i);
                        printf("\n");
                    }
                }
            }
        }
        else if(o==stop1)
        {
            for(int i=start2;i<=stop2;i++)
            {
                if(i<10)
                {
                    printf("%d:0%d",o,i);
                    printf("\n");
                }
                else
                {
                    printf("%d:%d",o,i);
                    printf("\n");
                }
            }
        }

        else
        {
            for(int i=start2;i<=59;i++)
            {
                if(i<10)
                {
                printf("%d:0%d",o,i);
                printf("\n");
                }
                else
                {
                printf("%d:%d",o,i);
                printf("\n");
                }
            }
            nud+=1;
        }
    }



}
