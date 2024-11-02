#include <stdio.h>

int main()

{
    int K,K1,K2,S1,S2,G;




    scanf("%d %d %d %d %d %d",&K,&K1,&K2,&S1,&S2,&G);







    if(K1<=K2)
    {
        if(S1>=9 )
        {

            if(G==1)
            {
                printf("1");
            }
            else if(G==2)
            {
                printf("1");
            }
        }
        else if(S2>=9)
        {
             if(G==1)
            {
                printf("1");
            }
            else if(G==2)
            {
                printf("1");
            }

        }
        else
        {

        }
    }


    else if(K2<=K1)
    {
        if(S1>=9)
        {
            if(G==1)
            {
                printf("2");
            }
            else if(G==2)
            {
                printf("2");
            }
        }

        else if(S2>=9)
        {
             if(G==1)
            {
                printf("2");
            }
            else if(G==2)
            {
                printf("2");
            }

        }
        else
        {

        }
    }



    else if(K2==K1)
    {
        if(S1>=9 && S2>=9 && S1==S2)
        {
            if(G==1)
            {
                printf("1");
            }
            else if(G==2)
            {
                printf("2");
            }
            else
            {

            }
        }
    }




    else if(S1<=8 && S2<=8 && S1==S2)
    {
            printf("0");

    }

    else
    {


    }









}
