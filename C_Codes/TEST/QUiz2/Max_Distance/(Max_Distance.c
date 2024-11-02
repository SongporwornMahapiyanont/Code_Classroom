#include <stdio.h>
 void main ()
 {  int max,min;
    int max1=-99999999;
    int result;

    while(1)
    {
        scanf("%d %d",&min,&max);
        if(max >= min)
        {
            if(max==0 && min==0)
            {
                    break;
            }
            else
            {
                result = max-min;
                if(result>max1)
                {
                    max1 = result;



                }
            }
        }
        else
        {
            break;
        }
    }
    printf("%d",max1);
}


