public class StandardDeviationTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StandardDeviation x= new StandardDeviation();

        System.out.println(x.toString());
        System.out.println("Average: " + x.calcAvg());
        System.out.println("Max number: " + x.getMax());
        System.out.println("Min number: " + x.getMin());
        System.out.println("Standard Deviation: " + x.calcStdDev());
        System.out.println("Histogram: ");
        x.displayHistogram();
    }
}