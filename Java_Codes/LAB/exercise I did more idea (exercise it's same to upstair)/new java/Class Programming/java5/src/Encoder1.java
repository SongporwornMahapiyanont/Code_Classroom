import java.util.Scanner;

class Encoder{
    String[] msg;
    int[] num;

    Encoder(String[] msg, int[] num){
        this.msg = msg;
        this.num = num;
    }

    private int encodeWord(String msg){
        int num = -1;
        for(int i=0; i<this.msg.length; i++){
            if(this.msg[i].equals(msg)){
                num = this.num[i];
                break;
            }
        }
        return num;
    }

    int[] encodeMsg(String[] word){
        int[] num = new int[word.length];
        for(int i=0; i<word.length; i++){
            num[i] = encodeWord(word[i]);
        }
        return num;
    }
}

class Decoder{
    String[] msg;
    int[] num;

    Decoder(String[] msg, int[] num){
        this.msg = msg;
        this.num = num;
    }

    private String decodeWord(int num){
        String str = "?";
        for(int i=0; i<this.num.length; i++){
            if(this.num[i] == num){
                str = msg[i];
                break;
            }
        }
        return str;
    }

    void decodeMsg(int[] num){
        for(int i=0; i<num.length; i++){
            System.out.print(decodeWord(num[i]) + " ");
        }
    }
}

public class Encoder1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] mainWord = new String[n];
        for(int i=0; i<n; i++){
            mainWord[i] = scan.next();
        }
        
        int[] mainNum = new int[n];
        for(int i=0; i<n; i++){
            mainNum[i] = scan.nextInt();
        }

        Encoder en = new Encoder(mainWord, mainNum);
        Decoder de = new Decoder(mainWord, mainNum);

        int k = scan.nextInt();
        String[] word = new String[k];
        for(int i=0; i<k; i++){
            word[i] = scan.next();
        }
        
        int[] encoder = en.encodeMsg(word);
        de.decodeMsg(encoder);
    }
}
