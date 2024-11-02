import java.util.Scanner;
public class IndexOf {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String sentens = "silpakorn university";
        String target = "si";
        int index = sentens.indexOf(target,1);
        System.out.println("index1 = " + index);
        while(index>=0)
        {
            System.out.println(index+1 + " ");
            System.out.println("indexstat = " + index);
            index = sentens.indexOf(target,index+1);
            System.out.println("indexend = " + index);
        }
    }
}
