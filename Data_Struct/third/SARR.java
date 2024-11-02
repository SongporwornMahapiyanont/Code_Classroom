package third;

public class SARR {
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
    public static void main(String[] args) {
        
    }
}
