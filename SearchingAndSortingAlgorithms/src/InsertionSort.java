import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int key= arr[i];
            int k = i-1;
            while((k>-1) && (arr[k]>key)){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = key;
        }
        return arr;
    }

    public static void main (String[] args){
        int[] theList = {0, 92, -120, 55, 14, 8888, 22, -8, 2, 1, 0};
        System.out.println(Arrays.toString(theList));
        System.out.println(Arrays.toString(insertionSort(theList)));
    }
}
