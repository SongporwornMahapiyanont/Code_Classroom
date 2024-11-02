#include <stdio.h>

void main ()
{

    float input,result,sum=0,N1,N2;
    int i=0,N;
	
	scanf("%d",&N);
	N1 = N;

    while(i<N)
    {
        scanf("%f",&input);

        if(input<=0)
        {
        	printf("Not positive\n");
        	result = sum/N2;
            break;
        }
        else if(input>0)
        {
			sum+=input;
			result = sum/N1;
			N2+=1;
        }
		i+=1;
    }
    
    printf("%.4f",result);

}
