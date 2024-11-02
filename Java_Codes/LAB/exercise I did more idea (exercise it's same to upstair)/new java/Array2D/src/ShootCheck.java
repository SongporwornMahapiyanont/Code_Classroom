import java.util.Scanner;

public class ShootCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int correct = 0;
        int incorrect = 0;
        int h = scan.nextInt();
        int w = scan.nextInt();
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;

            if(r >= 0 && r < h && c >= 0 && c < w){
                correct++;
            }
            else{
                incorrect++;
            }
        }

        System.out.println(correct);
        System.out.println(incorrect);
    }
}
