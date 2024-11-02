import java.util.Scanner;

class Character{
    String[] msg;
    int count = 0;

    Character(String[] msg){
        this.msg = msg;
    }

    void speak(){
        System.out.println(msg[count]);
        count++;
        if(count == msg.length){
            count = 0;
        }
    }
}

public class CharVoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();
        Character[] c = new Character[C];
        for(int i=0; i<C; i++){
            int N = scan.nextInt();
            scan.nextLine();
            String[] msg = new String[N];
            for(int j=0; j<N; j++){
                msg[j] = scan.nextLine();
            }
            c[i] = new Character(msg);
        }
        
        int K = scan.nextInt();
        for(int i=0; i<K; i++){
            int x = scan.nextInt() - 1;
            c[x].speak();
        }
    }
}
