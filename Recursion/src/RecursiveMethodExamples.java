public class RecursiveMethodExamples {
    public static void main(String[] args) {
        System.out.println("Method 1: " + recursiveMethod1(6));
        System.out.println("Method 2: " + recursiveMethod2(6));
        System.out.println("Method 3: " + recursiveMethod3(-4));
    }

    public static int recursiveMethod1(int x){
        if(x==1){
            return x-2;
        }
        else{
            return recursiveMethod1(x-1) +x;
        }
    }

    public static int recursiveMethod2(int x){
        if(x==1){
            return 2;
        }
        if(x==0){
            return 1;
        }
        else{
            return 1 + recursiveMethod2(recursiveMethod2(x-2));
        }
    }

    public static int recursiveMethod3(int x){
        if(x>0){
            return 0;
        }

        if(x==0){
            return 1;
        }

        else{
            return 2*(recursiveMethod3(x+2)) + recursiveMethod3(x+1) + 1;
        }
    }
}
