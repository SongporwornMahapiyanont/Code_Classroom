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
    scanf("%d %d %d", &A, &B, &C);
    if(A <= box1_1 && B <= box1_2 && C <= box1_3)
    {
        printf("1\n%d", size1 - A * B * C);
    }
    else if(A <= box2_1 && B <= box2_2 && C <= box2_3)
    {
        printf("2\n%d", size2 - A * B * C);
    }
    else if(A <= box3_1 && B <= box3_2 && C <= box3_3)
    {
        printf("3\n%d", size3 - A * B * C);
    }
    else
    {
        printf("Oversize product\n");
        printf("%d", A * B * C - size3);
    }
}
