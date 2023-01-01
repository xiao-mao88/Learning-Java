import java.util.Scanner;
public class IntegerAndModulus {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        System.out.println("How many passengers do you have?");
        int passengers= input.nextInt();

        //jumboJets
        int jumboJets=passengers/625;
        if(jumboJets<=1)
        {
            jumboJets=1;
        }

        //midJets
        int midJets=0;
        int smallPlanes=0;
        if(jumboJets>=1)
        {
            int num=passengers%625;
            int remainder=num%260;

            if(num<260)
            {
                midJets=1;
                remainder=0;
            }
            while(num>=260)
            {
                midJets++;
                num=num-260;
            }


            //Small Propellor Planes
            while(remainder>0)
            {
                smallPlanes++;
                remainder=remainder-50;
            }
        }


        //print out things
        System.out.println("Jumbo Jets: " + jumboJets);
        System.out.println("Mid-Sized Jets: " + midJets);
        System.out.println("Small Propellor Planes: " + smallPlanes);

    }

}