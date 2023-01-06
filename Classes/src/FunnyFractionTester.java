public class FunnyFractionTester {
    public static void main(String[] args) {
        FunnyFraction f1= new FunnyFraction(3,4);
        FunnyFraction f2= new FunnyFraction(5,6);

        System.out.println(f1.funnyAdd(f2));
        System.out.println(f1.funnySubtract(f2));
        System.out.println(f1.funnyMult(f2));
        System.out.println(f1.funnyDivide(f2));

    }

}
