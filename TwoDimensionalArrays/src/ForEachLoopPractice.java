public class ForEachLoopPractice {
    public static int addEverything(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int ele : row) {
                sum += ele;
            }
        }
        return sum;
    }

    public static void main (String[] args){
        int[][] test1 = {{1,2,3,4}, {5,6,7,8}, {1,2,3,4}, {5,6,7,8}};
        System.out.println(addEverything(test1));
    }
}
