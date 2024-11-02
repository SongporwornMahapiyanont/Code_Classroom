package Remove;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            int value = sc.nextInt();
            c.add(value);
        }
        System.out.println(c.toString());
        c.remove(2);
        System.out.println(c.toString());

        int k = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            String name = sc.next();
            names.add(name);
        }
        System.out.println(names.toString());
        names.remove(2);
        System.out.println(names.toString());
        sc.close();
    }
}
