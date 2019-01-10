package fundamental_algos;

import java.util.Scanner;

//n-1 sum
public class A232 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int sum = a[0];
        for (int i = 1; i < n; i++)
            sum += a[i];
        System.out.println("Sum = " + sum);
    }
}
