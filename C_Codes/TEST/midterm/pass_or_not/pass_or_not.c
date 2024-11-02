#include <stdio.h>
 void main()
 {
     int subject1,subject2,subject3,subject4;
     int input1,input2,input3,input4;
     int pass=0,fail=0;

    scanf("%d %d %d %d",&subject1,&subject2,&subject3,&subject4);
    scanf("%d %d %d %d",&input1,&input2,&input3,&input4);

    if(input1 >= subject1)
    {
        printf("1 ");
        pass+=1;
    }
    if(input2 >= subject2)
    {
        printf("2 ");
        pass+=1;
    }
    if(input3 >= subject3)
    {
        printf("3 ");
        pass+=1;
    }
    if(input4 >= subject4)
    {
        printf("4 ");
        pass+=1;
    }

    if(pass>=3)
    {
        printf("\npass");
    }
    else if(pass == 0)
    {
        printf("%d",pass);
        printf("\nfail");
    }
    else if(pass<3)
    {
        printf("\nfail");
    }
 }
