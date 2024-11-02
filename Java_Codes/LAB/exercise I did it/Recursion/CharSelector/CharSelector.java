package CharSelector;

import java.util.Scanner;

public class CharSelector {
    String selectChar(String s, int[] k) {
        if (s.length() == 1) {
            return Character.toString(s.charAt(0));
        }
        int index = k[s.length() - 1];
        char c = s.charAt((s.length() - 1) - (index % s.length()));
        System.out.println("index = " + index);
        System.out.println("s.lengh = " + (s.length()));
        System.out.println("cdsad = " + (index % s.length()));
        s = s.substring(0, s.length() - 1);
        System.out.println("ss = " + s);
        return selectChar(s, k) + c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        final int N = s.length();
        int[] k = new int[N];
        for (int i = 0; i < N; ++i) {
            k[i] = scan.nextInt();
        }
        CharSelector selector = new CharSelector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);
        scan.close();
    }
}
