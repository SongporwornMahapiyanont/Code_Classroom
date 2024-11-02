#include <stdio.h>

int even(int input)
{
	if(input%2==0)
	{
		return 1;
	}
	else 
	{
		return 0;	
	}
}
int odd(int input)
{
	return !even(input);
}

int main()
{
	int input;
	scanf("%d",&input);
	printf("even = %d\n",even(input));
	printf("odd = %d",odd(input));
	return 0;
}
