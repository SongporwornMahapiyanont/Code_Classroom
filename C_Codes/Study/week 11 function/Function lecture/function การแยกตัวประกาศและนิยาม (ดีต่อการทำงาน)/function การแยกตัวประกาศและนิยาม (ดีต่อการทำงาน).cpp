#include <stdio.h>

int even(int input); //declare and don't forget ';'
int odd(int input); //define and don't forget ';'

// if it's declare,It's will sub to working 

int main()
{
	int input;
	scanf("%d",&input);
	printf("even = %d\n",even(input));
	printf("odd = %d",odd(input));
	return 0;
}

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
