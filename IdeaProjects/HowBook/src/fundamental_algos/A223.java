package fundamental_algos;

import java.io.FileReader;
import java.io.IOException;

//count=n then check no of pass
public class A223 {

    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("f1.txt");
        int ch, count, n = 10;
        count = n;
        while ((ch = fr.read()) != -1) {
            System.out.print(ch + " ");
            if (ch < 50)
                count = --n;
        }
        System.out.println("Pass = " + count);
    }
}
