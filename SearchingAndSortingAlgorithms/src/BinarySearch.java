public class BinarySearch {
    public static int binarySearch (int[] a, int searchVal) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == searchVal)
                return mid;
            else if (a[mid] < searchVal)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main (String[] args){
        int[] theList = {3, 5, 7, 8, 9, 10, 22, 66, 100, 599, 1000};
        System.out.println(binarySearch(theList, 1000));
    }
}
