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
    scanf("%d",&N);

    while(i<N)
    {
        scanf("%d %d %d", &A, &B, &C);
        if(A <= box1_1 && B <= box1_2 && C <= box1_3)
        {
            printf("1\n");
            amount1+=1;
            result1 = result1 + (size1-(A*B*C));
        }
        else if(A <= box2_1 && B <= box2_2 && C <= box2_3)
        {
            printf("2\n");
            amount2+=1;
            result2 = result2 + (size2-(A*B*C));
        }
        else if(A <= box3_1 && B <= box3_2 && C <= box3_3)
        {
            printf("3\n");
            amount3+=1;
            result3 = result3 + (size3-(A*B*C));
        }
        else
        {
            printf("Oversize product\n");

        }
        i+=1;
    }
    printf("%d %d\n",amount1,result1);
    printf("%d %d\n",amount2,result2);
    printf("%d %d\n",amount3,result3);
}
