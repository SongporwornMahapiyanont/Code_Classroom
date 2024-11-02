package ClassArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        int N = scan.nextInt();
        for(int i=0;i<N;i++)
        {
            String name = scan.next();
            str.add(name);
        }
        jj k = new jj(str);
        k.PrinInfo();
        scan.close();
    }
}