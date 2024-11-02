import java.util.Scanner;

public class TogeInumaki {
    public static void SayWord(String str){
        if(str.equalsIgnoreCase("Shake")){
            System.out.print("Yes ");
        }
        else if(str.equalsIgnoreCase("Okaka")){
            System.out.print("No ");
        }
        else if(str.equalsIgnoreCase("Konbu")){
            System.out.print("Hi ");
        }
        else if(str.equalsIgnoreCase("Takana")){
            System.out.print("Are you okay ? ");
        }
        else if(str.equalsIgnoreCase("Tuna")){
            System.out.print("Focus ");
        }
        else if(str.equalsIgnoreCase("Tunamayo")){
            System.out.print("Serious matter ");
        }
        else if(str.equalsIgnoreCase("Sujiko")){
            System.out.print("Mmm ");
        }
        else if(str.equalsIgnoreCase("Mentaiko")){
            System.out.print("Combat ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int start = str.indexOf(" : ")+3;
        String word = str.substring(start, str.length());
        int space = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ' '){
                space++;
            }
        }

        String name = str.substring(0, start);
        int start_str2 = 0;
        System.out.print(name);

        for(int i=0; i<space; i++){
            int end_str2 = word.indexOf(' ', start_str2);
            String str2 = word.substring(start_str2, end_str2);
            SayWord(str2);
            start_str2 = end_str2+1;
        }

        String last_word = word.substring(start_str2, word.length());
        SayWord(last_word);
        scan.close();
    }
}
