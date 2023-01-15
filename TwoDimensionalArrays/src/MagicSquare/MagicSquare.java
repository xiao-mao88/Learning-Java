package MagicSquare;

class MagicSquare {
    private int [][] theSqr;

    //constructor
    public MagicSquare(int [][] arr){
        theSqr= new int [arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                theSqr[i][j]= arr[i][j];
            }
        }
    }

    //is it a magic square?
    public boolean isMagic() {
        if(theSqr.length!=theSqr[0].length){
            return false;
        }

        if(!valuesCheck()){
            return false;
        }

        int bleh= diagtot1();
        if(diagtot1()!=diagtot2()){
            return false;
        }

        for(int r=0; r<theSqr.length; r++){
            if(rowTot(r)!= bleh){
                return false;
            }
            if(colTot(r)!= bleh){
                return false;
            }
        }
        return true;
    }

    //stuff to check if it is a magic square
    private int rowTot(int r) {
        int total=0;
        for (int c=0; c<theSqr[0].length; c++){
            total+=theSqr[r][c];
        }
        return total;
    }

    private int colTot(int c) {
        int total=0;
        for (int r=0; r<theSqr.length; r++){
            total+=theSqr [r][c];
        }
        return total;
    }

    private int diagtot1() {
        int diag1=0;
        for(int i=0; i<theSqr.length; i++){
            diag1+=theSqr[i][i];
        }
        return diag1;
    }

    private int diagtot2() {
        int diag2=0;
        for(int i=0; i<theSqr.length; i++){
            diag2+=theSqr[theSqr.length-1-i][i];
        }
        return diag2;
    }

    private boolean valuesCheck() {
        int[] oneDimArray= new int[theSqr.length*theSqr[0].length];
        for(int r=0; r<theSqr.length; r++){
            for(int c=0; c<theSqr[0].length; c++){
                oneDimArray[(r*theSqr.length)+c]= theSqr[r][c];
            }
        }
        int s= (int) Math.pow(theSqr.length, 2);
        for(int i=0; i<oneDimArray.length; i++){
            if(oneDimArray[i]<1 || oneDimArray[i]>s){
                return false;
            }
            for(int j=i+1; j<oneDimArray.length; j++){
                if(oneDimArray[i]==oneDimArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    //is it a durer magic square?
    public boolean isDurerMagicSquare() {
        if(!isMagic()){
            return false;
        }
        int blah= diagtot1();
        if(blah!=cornerSum() || blah!=centerSum() || blah!=ULSum() || blah!=LLSum() || blah!=URSum() || blah!=LRSum() || blah!=topBottomCenter() || blah!=leftRightCenter()){
            return false;
        }
        return true;
    }

    //various sums
    private int cornerSum() {
        return  theSqr[0][0] +
                theSqr[0][theSqr.length - 1] +
                theSqr[theSqr.length - 1][0] +
                theSqr[theSqr.length - 1][theSqr.length - 1];
    }

    private int centerSum() {
        return theSqr[1][1] + theSqr[1][2] + theSqr[2][1] + theSqr[2][2];
    }

    private int ULSum() {
        return theSqr[0][0] + theSqr[0][1] + theSqr[1][0] + theSqr[1][1];
    }

    private int LLSum(){
        return theSqr[2][0] + theSqr[2][1] + theSqr[3][0] + theSqr[3][1];
    }

    private int URSum(){
        return  theSqr[0][2] + theSqr[0][3] + theSqr[1][2] + theSqr[1][3];
    }

    private int LRSum(){
        return theSqr[2][2] + theSqr[2][3] + theSqr[3][2] + theSqr[3][3];
    }

    private int topBottomCenter() {
        return theSqr[0][1] + theSqr[0][2] + theSqr[3][1] + theSqr[3][2];
    }

    private int leftRightCenter(){
        return theSqr[1][0] + theSqr[2][0] + theSqr[1][3] + theSqr[2][3];
    }

    //toString method
    public String toString() {
        String Square="";
        for(int r=0; r<theSqr.length; r++){
            for(int c=0; c<theSqr[0].length; c++){
                Square+=theSqr[r][c] + " ";
            }
            Square+="\n";
        }
        return Square;
    }
}