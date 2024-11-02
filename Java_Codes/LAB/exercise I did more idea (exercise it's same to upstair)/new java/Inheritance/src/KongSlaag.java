import java.util.Scanner;

class SlaagOffice{
    int a;
    int[] b;

    SlaagOffice(int a, int[] b){
        this.a = a;
        this.b = b;
    }

    void checkPrize(Lottery lot){
        if(lot.nums[0] == a){
            lot.oneFront = true;
        }
        if(lot.nums[3] == a){
            lot.oneBack = true;
        }
        if(lot.nums[0] == b[0] && lot.nums[1] == b[1]){
            lot.twoFront = true;
        }
        if(lot.nums[2] == b[0] && lot.nums[3] == b[1]){
            lot.twoBack = true;
        }
    }
}

class SlaagOffice2 extends SlaagOffice{
    int[][] exactPrizes;

    SlaagOffice2(int a, int[] b, int[][] exactPrizes){
        super(a, b);
        this.exactPrizes = exactPrizes;
    }

    @Override
    void checkPrize(Lottery lot) {
        boolean check2 = false;
        for(int i=0; i<exactPrizes.length; i++){
            boolean check = true;
            for(int j=0; j<4; j++){
                if(lot.nums[j] != exactPrizes[i][j]){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("You got exact-match prize");
                check2 = true;
                break;
            }
        }
        if(!check2){
            System.out.println("No exact-match prize");
        }
        super.checkPrize(lot);
    }
}

class Lottery{
    int[] nums;
    boolean oneFront = false;
    boolean oneBack = false;
    boolean twoFront = false;
    boolean twoBack = false;

    Lottery(int[] nums){
        this.nums = nums;
    }

    void reportPrize(){
        if(!oneFront && !oneBack && !twoFront && !twoBack){
            System.out.println("Sorry, no prize");
        }
        if(oneFront){
            System.out.println("You got one front prize");
        }
        if(oneBack){
            System.out.println("You got one back prize");
        }
        if(twoFront){
            System.out.println("You got two front prize");
        }
        if(twoBack){
            System.out.println("You got two back prize");
        }
    }
}

public class KongSlaag{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int a = scan.nextInt();
        // int[] b = {scan.nextInt(), scan.nextInt()};
        // SlaagOffice office = new SlaagOffice(a, b);

        // final int Q = scan.nextInt();
        // for(int i=0; i<Q; i++){
        //     int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        //     Lottery lotto = new Lottery(nums);
        //     office.checkPrize(lotto);
        //     lotto.reportPrize();
        // }


        int a = scan.nextInt();
        int[] b = {scan.nextInt(), scan.nextInt()};
        final int R = scan.nextInt();
        int[][] exactPrizes = new int[R][];
        for(int i=0; i<R; i++){
            int[] temp = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
            exactPrizes[i] = temp;
        }
        SlaagOffice2 office = new SlaagOffice2(a, b, exactPrizes);

        final int Q = scan.nextInt();
        for(int i=0; i<Q; i++){
            int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
            Lottery lotto = new Lottery(nums);
            office.checkPrize(lotto);
            lotto.reportPrize();
        }
    }
}