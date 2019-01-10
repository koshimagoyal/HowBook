package fundamental_algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//sine series
public class A25 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter x and n");
        float x = Float.parseFloat(br.readLine());
        float n = Float.parseFloat(br.readLine());
        float term = x, tsin = x;
        int i = 1;
        while (i <= n) {
            i = i + 2;
            term = -(term * x * x) / (i * (i - 1));
            tsin = tsin + term;
        }
        System.out.println(tsin);
    }
}
