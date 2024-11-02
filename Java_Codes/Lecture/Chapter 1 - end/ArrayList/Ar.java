package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Ar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        str.add("AAAA");
        str.add("BBBB");
        str.add("CCCC");
        System.out.println(str.toString());

        str.add(2, "DDDD");
        str.add(3, "FFFFF");
        str.add(4, "FFFFF");
        System.out.println("method .get = " + str.get(0));
        System.out.println("method .toString() = " + str.toString());

        // Method remove will remove value or object to first found only if we do not
        // set index.
        str.remove("FFFFF");
        System.out.println(str.toString());
        str.remove(new String("FFFFF")); // this and (str.remove("FFFFF");), it's same.
        System.out.println(str.toString());

        // For each
        ArrayList<Integer> in = new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        for (int value : in) // i = value Start it's inside the first index of ArrayList than it will keep
                             // increase when it's equal in[ArrayList.size()].
        {
            System.out.println(value); // this sample
        }
        in.clear();
        System.out.println("in(clear) = " + in.toString());
        ArrayList<String> ss = new ArrayList<>();
        ss.add("Dog");
        ss.add("Cat");
        ss.add("snake");
        for (String i : ss) {
            System.out.println(i);
        }
        ss.clear();
        System.out.println("ss(clear) = " + ss.toString());
        scan.close();
    }
}
