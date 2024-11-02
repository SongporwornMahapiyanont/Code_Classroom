#include <stdio.h>


void main()
{
<<<<<<< HEAD
    int y,x,number;
    int N=0,max=-99999999999;
    scanf("%d",&x);
=======
    int y,py;
    int number;
    int N=1,max=-999999;
    scanf("%d",&y);
>>>>>>> f33bc599f68bf05d26bc061b74d656150a77c54b
    while(1)
    {
        scanf("%d",&py);
        if(py==0)
        {
            break;
<<<<<<< HEAD
        }
        if(x==y)
        {
            N+=1;
        }
        else
        {
            x = y;
        }
        if(N>=max)
        {
            max = N;
            number = x;
        }

=======

        }else if(py==y)
        {
            N+=1;
        }
        if(py!=y)
        { 
            py=y;
        } 
            if(N>max)
           {
              max = N;
              number = y;
              N = 1;
           }
        
        
>>>>>>> f33bc599f68bf05d26bc061b74d656150a77c54b

    }
    printf("%d\n",max);
    printf("%d\n",number);

// this is code not finish yet.

}
