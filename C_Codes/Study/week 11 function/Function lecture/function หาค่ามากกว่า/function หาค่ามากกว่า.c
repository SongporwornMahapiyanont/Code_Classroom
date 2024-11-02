#include <stdio.h>

int max(int x,int y)
{
	if(x<y)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

void main()
{
	int input,input1;
	scanf("%d%d",&input,&input1);
	printf("%d",max(input,input1));
}
