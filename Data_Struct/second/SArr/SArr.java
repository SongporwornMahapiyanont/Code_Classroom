import java.util.Random;

public class SArr{
    private int[] arr;
    public SArr(int n){
        this.arr = new int[n];
    }
    public void randVal(int m){
        Random rand = new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = rand.nextInt(m+m+1) - m;
        }
    }
    public void interSort(){
        int i, j, tmp;
        for (i = 1; i < arr.length; i++)
        {   
            tmp=arr[i];
            for(j = i ;j>0 && arr[j - 1] > tmp; j --)
            {
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        } 
    }
    public void selectionSort(){
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++)
        {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            if (minIndex != i)
            {   tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
    public void bubbleSort(){
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped)
        {   
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++)
            {   if (arr[i] > arr[i + 1])
                {   tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
    public void shellSort(){
        int j;
        for( int gap = arr.length / 2; gap > 0; gap /= 2 )
            for( int i = gap; i < arr.length; i++ )
            {   int tmp = arr[ i ];
                for(j = i; j >= gap&&tmp <(arr[j - gap]);j -= gap) arr[ j ] = arr[ j - gap ];
                arr[ j ] = tmp;
            }
    }
    public void printVal(){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Random random = new Random();
        SArr sa;
        boolean inter = false,selection = false,bubble = false,shell = false;
        for(int i=0;i<4;i++)
        {
            int n = random.nextInt(10,20);
            int m = random.nextInt(10,50);
            sa = new SArr(n);
            sa.randVal(m);
            System.out.println("Random " + m + " numbers " + "[" + (m*-1) + ".." + m + "]" + " :");
            sa.printVal();
            if(!inter)
            {
                sa.interSort();
                inter = true;
                System.out.println("Insertion Sort : ");
                sa.printVal();
            }
            else if(!selection)
            {
                sa.selectionSort();
                selection = true;
                System.out.println("Selection Sort :");
                sa.printVal();
            }
            else if(!bubble)
            {
                sa.bubbleSort();
                bubble = true;
                System.out.println("Bubble Sort : ");
                sa.printVal();
            }
            else if(!shell)
            {
                sa.shellSort();
                shell = true;
                System.out.println("Shell Sort : ");
                sa.printVal();
            }

        }
    }
}