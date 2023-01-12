public class LinearSearch {

    public static int LinearSearch (int [] a, int searchVal) {
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] == searchVal)
                return j;
        }
        return -1;
    }

    public static void main (String[] args){
        int[] theList = {5, 6, 99, 10, 20, 45, 19};
        System.out.println(LinearSearch(theList, 99));
    }

}
