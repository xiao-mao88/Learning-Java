public class ArrayOfRandomInt {
    private int[] myArray={1, 2, 3, 4, 5, 4, 6, 7}; //these numbers used to check over code

    //constructors
    public ArrayOfRandomInt()
    {
        myArray= new int [50];
        for (int i= 0; i < 50; i++)
        {
            myArray[i] = (int)(Math.random() * 100) + 1;
        }
    }

    public ArrayOfRandomInt(int size)
    {
        myArray= new int [size];
        for (int i= 0; i < size; i++)
        {
            myArray[i] = (int)(Math.random() * 100) + 1;
        }
    }

    //even or odd
    public int numOdds()
    {
        int odds=0;
        for (int i=0; i<myArray.length; i++)
        {
            if (myArray[i]%2!=0)
            {
                odds++;
            }
        }
        return odds;
    }

    public int numEvens()
    {
        int evens=0;
        for (int i=0; i<myArray.length; i++)
        {
            if (myArray[i]%2==0)
            {
                evens++;
            }
        }
        return evens;
    }

    //occurring number
    public int occurs (int x)
    {
        int occurence= 0;
        for (int i=0; i<myArray.length; i++)
        {
            if (myArray[i]==x)
            {
                occurence++;
            }
        }
        return occurence;
    }

    //divisibility
    public int divisibleBy (int d)
    {
        int numOfTimes=0;
        for (int i=0; i<myArray.length; i++)
        {
            if(myArray[i]%d==0)
            {
                numOfTimes++;
            }
        }
        return numOfTimes;
    }

    //consecutive ascending pairs
    public void consecAdjPairs()
    {
        boolean occurs= false;
        for (int i=0; i<=myArray.length-2; i++)
        {
            if (myArray[i] == myArray[i+1]-1)
            {
                occurs= true;
                System.out.println("Number " + myArray[i] + " position " + i + " and number " + myArray[i+1] + " position " + (i+1) + " are consecutive adjacent pairs.");
            }
        }

        if(occurs==false)
        {
            System.out.println("No consecutive, adjacent, ascending pairs exist.");
        }
    }

    //consecutive ascending sets
    public void consecAdjSets(int s)
    {
        boolean occur= false;
        for (int i=0; i<=myArray.length-s; i++)
        {
            int beg=i;
            int end= beg+s-1;
            boolean isASet=true;
            while ((beg<=end)&&isASet)
            {
                if(myArray[beg]!=(myArray[beg+1]-1))
                {
                    isASet=false;
                }

                if(beg==end)
                {
                    occur=true;
                    System.out.println("\nThe Set is: ");
                    for(int j=i; j<=end; j++)
                    {
                        System.out.println("Number: " + myArray[j] + "\nIndex: " + j);
                    }
                }
                beg++;
                //determine if adjacent elements
                //fulfill the criteria
                //update isASet if necessary
            }
        }

        if(occur==false)
        {
            System.out.println("No consecutive, adjacent, ascending sets.");
        }
    }

    //toString
    public String toString()
    {
        String print= "";
        for (int i=0; i<myArray.length; i++)
        {
            print+= myArray[i] + " ";
            if((i+1)%10==0)
            {
                print +="\n";
            }
        }
        return print;
    }
}