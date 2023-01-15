package MagicSquare;

public class MagicTester {
    public static void main(String[] args) {
        int[][] anySq1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] notMagic1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] anySq2 = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        int[][] notMagic2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};

        MagicSquare ms = new MagicSquare(anySq1);  //testing a 3x3 magic square
        MagicSquare notMag1 = new MagicSquare(notMagic1);  //testing a 3x3 magic square
        MagicSquare ms2 = new MagicSquare(anySq2); //testing a 4X4 durer magic square
        MagicSquare notMag2 = new MagicSquare(notMagic2); //testing a 4X4 durer magic square

        //testing magic square
        if (ms.isMagic()) {
            System.out.println(ms + " is magic!");
        }
        else {
            System.out.println(ms + " is NOT magic!");
        }


        if (notMag1.isMagic()) {
            System.out.println(notMag1 + " is magic!");
        }
        else
            System.out.println(notMag1 + " is NOT magic!");

        //testing 4x4 durer magic square
        if (ms2.isDurerMagicSquare()) {
            System.out.println(ms2 + " is a Durer magic!");
        }
        else {
            System.out.println(ms2 + " is NOT a Durer Magic Square");
        }

        if (notMag2.isDurerMagicSquare()) {
            System.out.println(notMag2 + " is a Durer Magic Square!");
        }
        else {
            System.out.println(notMag2 + " is NOT a Durer Magic Square");
        }
    }
}