public class FunnyFraction {
    private int numerator;
    private int denominator;

    //constructors
    public FunnyFraction ()
    {
        numerator= 0;
        denominator= 1;
    }

    public FunnyFraction (int n, int d)
    {
        numerator = n;
        denominator=d;

        if(d==0)
        {
            denominator=1;
        }
    }

    //setters
    public void setNumerator (int n)
    {
        numerator= n;
    }

    public void setDenominator (int d)
    {
        denominator= d;
    }

    //getters
    public int getNumerator ()
    {
        return numerator;
    }

    public int getDenominator ()
    {
        return denominator;
    }

    //stuffs
    public FunnyFraction funnyAdd (FunnyFraction f)
    {
        int newnum= this.numerator + this.denominator + f.numerator + f.denominator;
        int newdeno= (this.denominator + f.denominator) * (this.numerator + f.numerator);

        if(newdeno==0)
        {
            newdeno=-1;
        }

        return new FunnyFraction (newnum, newdeno);
    }

    public FunnyFraction funnySubtract (FunnyFraction f)
    {
        int newnum= f.denominator - this.denominator - f.numerator - this.numerator;
        int newdeno= (f.denominator - this.denominator) * (f.numerator - this.numerator);

        if(newdeno==0)
        {
            newdeno=-1;
        }

        return new FunnyFraction (newnum, newdeno);
    }

    public FunnyFraction funnyMult(FunnyFraction f)
    {
        int newnum= (int) Math.sqrt(Math.pow(this.numerator - f.numerator,2) + this.denominator);
        int newdeno= (int) Math.pow(this.denominator - f.denominator, 2) - f.numerator;

        if(newdeno==0)
        {
            newdeno=-1;
        }

        return new FunnyFraction (newnum, newdeno);
    }

    public FunnyFraction funnyDivide (FunnyFraction f)
    {
        int newnum= (this.numerator * f.denominator);
        int newdeno= (this.denominator * f.numerator);

        if(newdeno==0)
        {
            newdeno=-1;
        }

        return new FunnyFraction (newnum, newdeno);
    }

    public String toString()
    {
        String result= "";
        result= numerator + "/" + denominator;
        return result;
    }
}