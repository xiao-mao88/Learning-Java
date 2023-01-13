import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int index = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
                int smallerNum = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNum;
            }
        }
        return arr;
    }

    public static void main (String[] args){
        int[] theList = {4, 1, -10, 99, 20, 101, 22, 1000, 2, 1, 0};
        System.out.println(Arrays.toString(theList));
        System.out.println(Arrays.toString(selectionSort(theList)));
    }
}
