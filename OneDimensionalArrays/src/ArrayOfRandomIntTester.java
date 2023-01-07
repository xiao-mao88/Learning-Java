public class ArrayOfRandomIntTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayOfRandomInt x= new ArrayOfRandomInt();
        int ocnum= 50;
        int s=4;
        int d= 5;

        System.out.println(x);
        System.out.println("Number of evens: " + x.numEvens());
        System.out.println("Number of odds: " + x.numOdds());
        if (ocnum>=1&&ocnum<=100)
        {
            System.out.println("Number of occurrences for the number 50: " + x.occurs(50));
        }

        if (d==(int)d && d>1)
        {
            System.out.println("Number of elements divisible by five: " + x.divisibleBy(5));
        }

        x.consecAdjPairs();

        if((s == (int)s) && (s>1))
        {
            x.consecAdjSets(4);
        }
    }
}