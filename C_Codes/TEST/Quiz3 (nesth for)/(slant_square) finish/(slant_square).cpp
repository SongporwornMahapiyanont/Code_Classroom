#include <stdio.h>
int main()
{
    int N;
    int star=0;
    scanf("%d",&N);
	if(N%3==0)
	{
		for(int R=N;R>0;R--)
		{
			for(int space=0;space<star;space++)
			{
				printf(" ");
			}
			for(int C=N/3;C>0;C--)
			{
				printf("*  ");
			}
			printf("\n");
			star++;
			if(star==3)
			{
				star=0;
			}
		}
	}
	else
	{
	}

	return 0;
}

