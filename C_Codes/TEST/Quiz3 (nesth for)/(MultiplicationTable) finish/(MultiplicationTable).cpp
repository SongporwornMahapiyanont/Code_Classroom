#include <stdio.h>
int main()
{
    int startmain,startkun,endmain,endkun;
    scanf("%d%d%d%d",&startmain,&startkun,&endmain,&endkun);
    int copystartkun = startkun;
    for(int row=startmain;row<=endmain;row++)
    {
        if(row==endmain)
        {
            break;
        }
        for(int col=copystartkun;col<=endkun;col++)
        {
            printf("%d x %d = %d\n",row,col,row*col);
        }
        copystartkun=1;
    }
    
    for(int col=1;col<=startkun;col++)
    {
        int row = endmain;
        printf("%d x %d = %d\n",row,col,row*col);
    }

}

