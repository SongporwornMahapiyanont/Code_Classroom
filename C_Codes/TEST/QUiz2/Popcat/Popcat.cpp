#include <stdio.h>
int main ()
{

    int i=0,N,input;
    int thai=0,taiwan=0,malay=0,finland=0;
	int max=-9999999;
	scanf("%d",&N);
	
	while(i<N)
	{
		scanf("%d",&input);
		if(input>=1 && input<=4)
		{
			if(input==1)
			{
				thai+=1;
				if(thai>max)
				{
					max = thai;
				}
			}
			else if(input==2)
			{
				taiwan+=1;
				if(taiwan>max)
				{
					max = taiwan;
				}
			}
			else if(input==3)
			{
				malay+=1;
				if(malay>max)
				{
					max = malay;
				}
			}
			else if(input==4)
			{
				finland+=1;
				if(finland>max)
				{
					max = finland;				
				}
			}
			
		}
		else
		{
			
		}
		i+=1;
	}
	if(max==thai)
	{
		printf("Thailand won with a score of %d\n",thai);
	}
	else if(max==taiwan)
	{
		printf("Taiwan won with a score of %d\n",taiwan);
	}
	else if(max==malay)
	{
		printf("Malaysia won with a score of %d\n",malay);
	}
	else if(max==finland)
	{
		printf("Finland won with a score of %d\n",finland);
	}

}
