import java.util.Scanner;

public class SpellCheck1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        int[] answer = new int[10];
        for(int i=0; i<10; i++){
            String check = scan.next();
            boolean found = false;
            for(int j=0; j<n; j++){

                if(str[j].equals(check)){
                    found = true;
                }
            }
            if(found){
                answer[i]++;
            }
        }

        for(int i=0; i<10; i++){
            System.out.print(answer[i]);
        }
        scan.close();
    }
}
