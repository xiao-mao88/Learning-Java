import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public static void main (String[] args){
        int[] theList = {18, 55, 10000, 3, 14, 0, -22, -8, 2, 88, 0};
        System.out.println(Arrays.toString(theList));
        System.out.println(Arrays.toString(bubbleSort(theList)));
    }
}
