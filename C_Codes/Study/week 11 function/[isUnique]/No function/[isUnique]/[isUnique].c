#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int num[N];

    for(int i=0;i<N;i+=1)
    {
        scanf("%d",&num[i]);
    }
    int isUnique=1;
    for(int j=0;j<N;j++)
    {
        int target=num[j];
        int count=0;
        //printf("Target : %d match with :", target);
        for(int i=0;i<N;i++)
        {
            if(num[i] == target)
            {
                //printf("%d ", i);
                count+=1;
            }
        }
        if(count > 1)
        {
            isUnique=0;
            //printf("Not unique");
        }
        else
        {
            //printf("Unique");
        }
        //printf("\n");
    }
    printf("%d",isUnique);
}
