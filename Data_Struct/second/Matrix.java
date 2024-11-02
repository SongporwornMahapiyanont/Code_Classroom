
import java.util.*;
public class Matrix {
    public int[][] mutiply(int[][] arr,int[][] copy){
        int[][] result = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                for(int k=0;k<arr.length;k++)
                {
                    result[i][j]+=arr[k][i]*copy[j][k];
                }
            }
        }
        return result;
    }
    public void printInfo(int[][] result){
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result.length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matrix call = new Matrix();
        int[][] arr = {{0,1,1,0,0},{1,0,0,1,0},{1,0,0,1,1},{0,1,1,0,1},{0,0,1,1,0}};
        int source = 1;
        int target = 5;
        int[][] two = call.mutiply(arr,arr);
        int[][] three = call.mutiply(call.mutiply(arr, arr),arr);
        System.out.println("Enter Source Vertex: " + source );
        System.out.println("Enter Source Vertex: " + target );
        System.out.println("From "+ source + " to " + target);
        System.out.println("#path (length=2) : " + two[source-1][target-1]);
        System.out.println("#path (length=2) : " + three[source-1][target-1]);
    }
}
