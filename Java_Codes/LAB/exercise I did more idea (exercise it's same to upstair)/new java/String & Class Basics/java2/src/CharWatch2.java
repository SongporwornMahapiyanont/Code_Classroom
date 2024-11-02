import java.util.Scanner;

public class CharWatch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int n = scan.nextInt();
        scan.nextLine();

        String[] str2 = new String[n];
        for(int i=0; i<n; i++){
            str2[i] = scan.nextLine(); 
        }

        int[] freq = new int[5];
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int num = scan.nextInt();

            for(int j=0; j<n; j++){
                if(num > 0 && num <= str2[j].length()){
                    for(int x=0; x<5; x+=2){
                        char target = str2[j].charAt(num-1);
                        if(target == str.charAt(x)){
                            freq[x]++;
                        }
                    }
                }  
            }
        }

        for(int i=0; i<5; i+=2){
            System.out.println(freq[i]);
        }
        scan.close();
    }
}
