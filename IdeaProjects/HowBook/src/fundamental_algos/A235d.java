package fundamental_algos;

import java.util.Scanner;

//1+1/2+...
public class A235d {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        float sum = 0.0f;
        for (int i = 1; i <= n; i++)
            sum += (1 / (float) i);
        System.out.println("Sum = " + sum);
    }
}
