#include <stdio.h>
int  main()
{
    int N;
    scanf("%d",&N);
    int star=N;
    int y=N;
    int o=N;
	for(int row=0;row<N;row++)
    {
    	int sum=o%10;
		for(int space=0;space<(y-o);space++)
		{
			printf(" ");
		}
		for(int i=0;i<star;i++)
		{
			printf("%d",sum);
		}
		star-=1;
		o-=1;
		printf("\n");
    }
}

