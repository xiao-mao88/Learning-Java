public class StandardDeviation {
    private int[] dice;

    //constructor
    public StandardDeviation() {
        dice= new int [1000];
        for (int i= 0; i < 1000; i++)
        {
            dice[i] = ((int)(Math.random() * 6) + 1)+((int)(Math.random() * 6) + 1)+((int)(Math.random() * 6) + 1);
        }
    }

    //calculating the average
    public double calcAvg(){
        int allnumbers=0;
        double average;
        for(int i=0; i<dice.length; i++) {
            allnumbers+=dice[i];
        }
        return average= allnumbers/dice.length;
    }

    //max and min
    public int getMax(){
        int maxNum=0;
        for (int i=0; i<dice.length; i++) {
            if(dice[i]>maxNum) {
                maxNum=dice[i];
            }
        }
        return maxNum;
    }

    public int getMin() {
        int minNum=dice[0];
        for (int i=0; i<dice.length; i++)
        {
            if(dice[i]<minNum) {
                minNum=dice[i];
            }
        }
        return minNum;
    }

    //standard deviation
    public double calcStdDev(){

        //calculating mean (average)
        int allnumbers=0;
        double average;
        for(int i=0; i<dice.length; i++) {
            allnumbers+=dice[i];
        }

        average= allnumbers/dice.length;

        //for loop to add sigma stuffs
        double add=0;
        for (int i=0; i<dice.length; i++) {
            add+=Math.pow(dice[i]-average, 2);
        }

        //actual standard deviation calculation
        double stdDev= Math.sqrt(add/(dice.length-1));
        return stdDev;
    }

    //histogram
    public void displayHistogram(){
        int [] occurs= new int [19];
        for (int i=0; i<dice.length; i++) {
            occurs[dice[i]]++;
        }

        for (int j=3; j<19; j++){
            if(j<10) {
                System.out.print(j+" " + " | ");
            }

            else {
                System.out.print(j+" | ");
            }

            for(int k= 0; k<occurs[j]/5; k++){

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //tostring
    public String toString(){
        String print= "Array Numbers: \n";
        for (int i=0; i<dice.length; i++)
        {
            print+= dice[i] + " ";
            if((i+1)%25==0)
            {
                print +="\n";
            }
        }
        return print;
    }
}