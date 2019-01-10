package fundamental_algos;

import java.util.Scanner;

//harmonic mean
public class A234 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int a[] = new int[n];
        float sum = 0.0f;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += (1 / (float) a[i]);
        }
        System.out.println("Harmonic Mean = " + n / sum);
    }
}
