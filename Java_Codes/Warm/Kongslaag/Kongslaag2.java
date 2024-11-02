package Kongslaag;

import java.util.Scanner;

class SlaagOffice2 extends SlaagOffice {
    int[][] exactPrizes;

    SlaagOffice2(int onenumber, int[] twonumber, int[][] exactprizes) {
        super(onenumber, twonumber);
        this.exactPrizes = exactprizes;
    }

    @Override
    void checkPrize(Lottery lottery) {
        boolean CHECK = false;
        for (int i = 0; i < exactPrizes.length; i++) {
            boolean check = true;
            for (int j = 0; j < 4; j++) {
                if (exactPrizes[i][j] == lottery.lotteryNums[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                CHECK = true;
                System.out.println("You got exact-match prize");
                break; // keyword
            }
        }
        if (!CHECK) {
            System.out.println("No exact-match prize");
        }
        super.checkPrize(lottery);
    }
}

class SlaagOffice {
    int OneNumber;
    int[] TwoNumber;

    SlaagOffice(int onenumber, int[] twonumber) {
        this.OneNumber = onenumber;
        this.TwoNumber = twonumber;
    }

    void checkPrize(Lottery lottery) {
        if (lottery.lotteryNums[0] == OneNumber) {
            lottery.oneFront = true;
        }
        if (lottery.lotteryNums[3] == OneNumber) {
            lottery.oneBack = true;
        }
        if (lottery.lotteryNums[0] == TwoNumber[0] && lottery.lotteryNums[1] == TwoNumber[1]) {
            lottery.twoFron = true;
        }
        if (lottery.lotteryNums[2] == TwoNumber[0]
                && lottery.lotteryNums[3] == TwoNumber[1]) {
            lottery.twoBack = true;
        }
    }
}

class Lottery {
    int[] lotteryNums;
    boolean oneFront = false, oneBack = false, twoFron = false, twoBack = false;

    Lottery(int[] nums) {
        this.lotteryNums = nums;
    }

    void reportPrize() {
        if (oneFront)
            System.out.println("You got one front prize");
        if (oneBack)
            System.out.println("You got one back prize");
        if (twoFron)
            System.out.println("You got two front prize");
        if (twoBack)
            System.out.println("You got two back prize");
        if (!oneFront && !oneBack && !twoBack && !twoFron)
            System.out.println("Sorry, no prize");
    }
}

public class Kongslaag2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = { scan.nextInt(), scan.nextInt() };
        final int R = scan.nextInt();
        int[][] exactPrizes = new int[R][];
        for (int i = 0; i < R; ++i) {
            int[] temp = { scan.nextInt(), scan.nextInt(),
                    scan.nextInt(), scan.nextInt() };
            exactPrizes[i] = temp;
        }
        SlaagOffice2 office = new SlaagOffice2(a, b, exactPrizes); // keyword

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            // Create a 4-number array from user inputs.
            int[] nums = { scan.nextInt(), scan.nextInt(),
                    scan.nextInt(), scan.nextInt() };
            Lottery lotto = new Lottery(nums);
            office.checkPrize(lotto);
            lotto.reportPrize();
        }
        scan.close();
    }
}
