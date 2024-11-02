#include <stdio.h>
int isUnique_func(int* num,int N)
{
     int isUnique=1;
    for(int j=0;j<N;j++)
    {
        int target=num[j];
        int count=0;
        //printf("Target : %d match with :", target);
        for(int i=j+1;i<N;i++)
        {
            if(num[i] == target)
            {
                //printf("%d ", i);
                isUnique=0;
                return isUnique;
            }
        }
        //printf("\n");
    }
    return isUnique;
}
void main()
{
    int N;
    scanf("%d",&N);
    int num[N];

    for(int i=0;i<N;i+=1)
    {
        scanf("%d",&num[i]);
    }
    int isUnique  = isUnique_func(num, N);
    printf("%d",isUnique);
}
