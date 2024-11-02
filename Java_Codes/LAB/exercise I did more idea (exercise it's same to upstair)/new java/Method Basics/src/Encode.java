import java.util.Scanner;

public class Encode {
    static void EncodAlphabet(String str, int[] num){
        int n = str.length();
        for(int i=0; i<n; i++){
            int c = (int) str.charAt(i);
            int c1 = c + num[i];
            if(c1 > (int) 'Z'){
                c1-=(int) 'Z';
                c1+=(int) 'A'-1;
            }
            System.out.print((char) c1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int[] n = new int[name.length()];
        for(int i=0; i<name.length(); i++){
            n[i] = scan.nextInt();
        }

        EncodAlphabet(name, n);
    }
}
