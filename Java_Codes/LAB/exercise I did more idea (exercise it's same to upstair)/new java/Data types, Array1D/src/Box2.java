import java.util.Scanner;

public class Box2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int k = scan.nextInt();
        int[] box = new int[n];
        for(int i=0; i<k; i++){
            int do_ = scan.nextInt();
            if(do_ == 1){
                int count = scan.nextInt();
                int box_num = scan.nextInt();

                if(count <= arr[box_num-1]){
                    box[box_num-1] += count;
                    arr[box_num-1] -= count;
                    System.out.println(box[box_num-1]); 
                }
                else {
                    System.out.println(-1);
                }
                
            }
            else {
                boolean enough = false;
                int count = scan.nextInt();
                for(int j=0; j<n; j++){
                    if(box[j]>0){
                        if(box[j]<=count){
                            count-=box[j];
                            arr[j]+=box[j];                           
                            box[j]=0;
                        }
                        else{
                            int set = count;
                            count-=box[j];
                            
                            box[j]-=set;
                            arr[j]+=set;
                            
                            
                        }
                        
                    }
                    
                    if(count<1){
                        System.out.println(j+1 + " " + box[j]);
                        enough = true;
                        break;
                    }
                }
                if(enough == false){
                    System.out.println(n + " " + 0);
                }
                
            }
            for(int j=0; j<n; j++){
                System.out.print(box[j] + " ");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}
