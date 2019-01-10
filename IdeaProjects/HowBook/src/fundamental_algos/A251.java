package fundamental_algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//0!+1!+2!+....
public class A251 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        A246 a = new A246();
        for (int i = 0; i <= n; i++)
            sum += a.fact(i);
        System.out.println(sum);
    }
}
