import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class FileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        int number;
        Scanner input= new Scanner
                (new File("FileIOProgrammingFile.txt"));
        PrintWriter  writer = new PrintWriter
                (new File("out/FileIOProgrammingFileOutput.txt"));

        while (input.hasNext())
        {
            number = input.nextInt();
            if (number>0)
            {
                for (int i=number; i>0; i--)
                {
                    writer.print("*");
                    System.out.print("*");
                }
            }

            if(number==0)
            {
                writer.print("\n");
                System.out.print("\n");
            }

            if(number<0)
            {
                for (int i=number; i<0; i++)
                {
                    writer.print(" ");
                    System.out.print(" ");
                }
            }
        }
        writer.close();
    }
}