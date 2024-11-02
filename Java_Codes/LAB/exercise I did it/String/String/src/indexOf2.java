import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        String target = sc.nextLine();
        int count=0;
        int index = sent.indexOf(target);

        while(index>=0)
        {
            count++;
            System.out.print((index+1) + " ");
            index = sent.indexOf(target,index+1);
        }
        if(count==0)
        {
            System.out.println("string not found");
        }
    }

}