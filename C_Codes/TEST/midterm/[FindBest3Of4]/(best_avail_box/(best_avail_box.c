#include <stdio.h>

 int main() {
    int box1_1 = 15;
    int box1_2 = 10;
    int box1_3 = 8;
    int size1 = box1_1 * box1_2 * box1_3;

    int box2_1 = 25;
    int box2_2 = 15;
    int box2_3 = 12;
    int size2 = box2_1 * box2_2 * box2_3;

    int box3_1 = 50;
    int box3_2 = 40;
    int box3_3 = 20;
    int size3 = box3_1 * box3_2 * box3_3;

    int A, B, C;
    int result1=0,result2=0,result3=0;
    int amount1=0,amount2=0,amount3=0;
    int i =0,N;
    int B1,B2,B3;
    int b1=0,b2=0,b3=0;

    scanf("%d",&N);
    scanf("%d %d %d",&B1,&B2,&B3);

    while(i<N)
    {
        scanf("%d %d %d", &A, &B, &C);
        if(A <= box1_1 && B <= box1_2 && C <= box1_3)
        {
            if(b1<B1)
            {
                printf("1\n");
                b1+=1;
            }
            else if(b2<B2)
            {
                printf("2\n");
                b2+=1;
            }
            else if(b3<B3)
            {
                printf("3\n");
                b3+=1;
            }
            else
            {
                printf("Box not available\n");
            }
        }
        else if(A <= box2_1 && B <= box2_2 && C <= box2_3)
        {
            if(b2<B2)
            {
                printf("2\n");
                b2+=1;
            }
            else if(b3<B3)
            {
                printf("3\n");
                b3+=1;
            }
            else
            {
                printf("Box not available\n");
            }
        }
        else if(A <= box3_1 && B <= box3_2 && C <= box3_3)
        {
            if(b3<B3)
            {
                printf("3\n");
                b3+=1;
            }
            else
            {
                printf("Box not available\n");
            }
        }
        else
        {
            printf("Oversize product\n");

        }
        i+=1;
    }
}
