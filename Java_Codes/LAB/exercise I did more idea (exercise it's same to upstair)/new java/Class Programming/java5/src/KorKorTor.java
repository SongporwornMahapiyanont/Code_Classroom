import java.util.Scanner;

class Party{
    String name_pak;
    int num;
    Scanner scan;
    String[] name;
    String[] last_name;
    int[] ket;

    Party(String name_pak, int num, Scanner scan){
        this.name_pak = name_pak;
        this.num = num;
        name = new String[num];
        last_name = new String[num];
        ket = new int[num];

        for(int i=0; i<num; i++){
            name[i] = scan.next();
            last_name[i] = scan.next();
            ket[i] = scan.nextInt();
            scan.nextLine();
        }

    }

    void printInfo(int regionNumber){
        if(regionNumber == 0){
            for(int i=0; i<num; i++){
                System.out.println(name[i] + " " + last_name[i] + " " + ket[i]);
            }
        }
        else if(regionNumber > 0){
            boolean found = false;
            for(int i=0; i<num; i++){
                if(ket[i] == regionNumber){
                    found = true;
                    System.out.println(name[i] + " " + last_name[i]);
                }
            }
            
            if(!found){
                System.out.println("none");
            }
        }
        else{
            System.out.println("invalid region number");
        }
    }
}

class Precinct{
    String namePrecinct;
    String[] name_pak;
    int[] score;

    Precinct(String namePrecinct, String[] name_pak){
        this.namePrecinct = namePrecinct;
        this.name_pak = name_pak;
        score = new int[name_pak.length];
    }

    void count(int partyNumber){
        boolean found = false;
        for(int i=0; i<score.length; i++){
            if(partyNumber-1 == i){
                found = true;
                score[partyNumber-1]++;
                System.out.println(name_pak[partyNumber-1] + " " + score[partyNumber-1]);
            }
        }

        if(!found){
            System.out.println("invalid number");
        }
    }

    void printInfo(){
        for(int i=0; i<score.length; i++){
            System.out.println(i+1 + " " + name_pak[i] + " " + score[i]);
        }
    }

    void printMax(){
        int max = Integer.MIN_VALUE;
        int targer = 0;
        for(int i=0; i<score.length; i++){
            if(score[i] > max){
                max = score[i];
                targer = i;
            }
        }

        for(int i=0; i<score.length; i++){
            if(score[i] == max){
                System.out.println(i+1 + " " + name_pak[i] + " " + score[i]);
            }
        }

    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //KORKORTOR 1
        // int n = scan.nextInt();
        // Party[] party = new Party[n];
        // String[] name_pak = new String[n];
        // int[] num = new int[n];
        // for(int i=0; i<n; i++){
        //     name_pak[i] = scan.next();
        //     num[i] = scan.nextInt();
        // }

        // for(int i=0; i<n; i++){
        //     party[i] = new Party(name_pak[i], num[i], scan);
        // }
        
        // int k = scan.nextInt();
        // for(int i=0; i<k; i++){
        //     int partyNumber = scan.nextInt() - 1;
        //     int regionNumber = scan.nextInt();
        //     party[partyNumber].printInfo(regionNumber);
        // }

        //KORKORTOR 2
        String namePrecinct = scan.nextLine();
        int n = scan.nextInt();
        scan.nextLine();
        String[] name_pak = new String[n];
        for(int i=0; i<n; i++){
            name_pak[i] = scan.nextLine();
        }

        Precinct precinct = new Precinct(namePrecinct, name_pak);

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int order = scan.nextInt();
            if(order == 1){
                int P = scan.nextInt();
                precinct.count(P);
            }
            else if(order == 2){
                precinct.printInfo();
            }
            else {
                precinct.printMax();
            }
        }
    }
}
