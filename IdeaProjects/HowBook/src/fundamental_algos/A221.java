package fundamental_algos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//calculate total marks, no of passes and % of passes
public class A221 {

    public static void main(String args[]) throws IOException {
        FileWriter f = new FileWriter("f1.txt");
        System.out.println("enter file elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            f.write(sc.nextInt());
        f.close();
        System.out.println("file elements are");
        FileReader fr = new FileReader("f1.txt");
        int ch, sum = 0, count = 0, sp = 0;
        while ((ch = fr.read()) != -1) {
            System.out.print(ch + " ");
            sum += ch;
            if (ch >= 50) {
                count++;
                sp += ch;
            }
        }
        float per = (sp / count);
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("No of passes =" + count);
        System.out.println("Percentage of passes =" + per + "%");
        fr.close();
    }
}
