import java.util.ArrayList;
import java.util.Scanner;

//part 2
public class SomeJavaPractice {
    public static void insert (ArrayList<Integer> list, Integer value)
    {
        int index = 0;
        while (index < list.size() && value > list.get(index) )
            index++;
        list.add(index,value);
    }

    //part 3
    public static ArrayList<Integer> addRandNum ()
    {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        System.out.print("How many integers?");
        Scanner myObj = new Scanner(System.in);
        int length = myObj.nextInt();  //get input from keyboard
        for (int j = 0; j < length;  j++)
        {
            int newNum = (int) (Math.random() * 101);
            list.add(new Integer(newNum));
        }
        return list;
    }

    //part 4
    public static void printValuesLess(ArrayList<Integer> list, int j)
    {
        System.out.println ("bleh");
        for (Integer i: list )
            if (i < j)
                System.out.println (i);
    }

    //part 5
    public static void anotherMethod (ArrayList<String> strList)
    {
        boolean even = true;
        int index = 0;
        while (index < strList.size() )
        {
            if (even)
                strList.set(index, "");
            index++;
            even = !even;
        }
    }

    public static void main (String[] args){
        //part 1
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < 4; j++)
            list.add(j * j);
        Integer intOb = list.get(2);
        int n = list.get(3);
        Integer x = list.set(3,5);
        x = list.remove(2);
        list.add(1,7);
        list.add(2,8);

        //part 6
        ArrayList<String> names = new ArrayList<String>();
        names.add("Xavier");
        names.add("Yvonne");
        names.add("Zelda");
        System.out.println (names);

        //part 7
        ArrayList<String> theNames = new ArrayList<String>();
        names.add("Andrew");
        names.add("Barry");
        names.add("Charles");
        names.add("Dorothy");
        names.add("Evan");
        names.add("Flo Rida");
        int i = 1;
        while (i < names.size())
        {
            names.remove(i-1);
            i += 2;
        }

        //part 8
        ArrayList<String> admin = new ArrayList<String>();
        admin.add("Anthony");
        admin.add("Ojas");
        admin.add("Meredith");
        admin.add("RobertU");
        admin.add("April");
        admin.set(2,"6");
        admin.add(4,"RobertR");
        admin.get(4);

    }
}



