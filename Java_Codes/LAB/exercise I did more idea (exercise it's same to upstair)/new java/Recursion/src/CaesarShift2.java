import java.util.Scanner;

public class CaesarShift2 {

    String cshift2(String msg, int[] dist, int i){
        char c = msg.charAt(0);
        int c1 = (int) c + dist[i];
        if(c1 > 90){
            c1 -= 90;
            c1 += 64;
        }
        i++;
        if(i == dist.length){
            i = 0;
        }
        if(msg.length() == 1){
            c = (char) c1;
            return Character.toString(c);
        }
        msg = msg.substring(1);
        return (char) c1 + cshift2(msg, dist, i);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = scan.next();
        int n = scan.nextInt();
        int[] dist = new int[n];
        for(int i=0; i<n; i++){
            dist[i] = scan.nextInt();
        }
        CaesarShift2 cs = new CaesarShift2();
        String ans = cs.cshift2(msg, dist, 0);
        System.out.println(ans);
    }
}
