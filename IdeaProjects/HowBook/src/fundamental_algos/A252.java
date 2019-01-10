package fundamental_algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//e=1/0!+1/1!+1/2!+....
public class A252 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n = Integer.parseInt(br.readLine());
        float sum = 0.0f;
        A246 a = new A246();
        for (int i = 0; i <= n; i++)
            sum += 1 / (float) a.fact(i);
        System.out.println(sum);
    }

}
