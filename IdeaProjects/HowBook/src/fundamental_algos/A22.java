package fundamental_algos;

import java.io.FileReader;
import java.io.IOException;

//find no of passes
public class A22 {

    public static void main(String args[]) throws IOException {
        FileReader f = new FileReader("f1.txt");
        int ch, count = 0;
        while ((ch = f.read()) != -1) {
            if (ch >= 50)
                count++;
        }
        System.out.print("No of passes =" + count);
        f.close();
    }

}
