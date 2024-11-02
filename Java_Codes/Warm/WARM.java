import java.util.ArrayList;
import java.util.Scanner;

public class WARM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        System.out.println(x.toString());
        x.add(2, 10);
        System.out.println(x.toString());
    }

}
