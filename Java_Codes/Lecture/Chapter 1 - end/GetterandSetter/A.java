package GetterandSetter;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Id a = new Id();
        // a.id; We cannot call it.
        System.out.println(a.Getter()); // We can call it.
        a.Setter();
    }
}
