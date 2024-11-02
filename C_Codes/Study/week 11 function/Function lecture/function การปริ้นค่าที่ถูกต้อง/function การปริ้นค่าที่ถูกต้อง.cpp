#include <stdio.h>

int add(int x,int y)
{
	x = x+y; //now x=7
	x = x*y; //now x=14
	return x;	
}

int main()
{
	int x=5,y=2; //it's main
	int result;
	result = add(x,y); //it's sub
	printf("x = %d\n",x); //it's main
	printf("result = %d",result); //it's sub
	
}
