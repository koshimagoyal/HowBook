package fundamental_algos;

import java.util.Scanner;

//fibonacci series
public class A26 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 2; i < n; i++) {
            int t = a + b;
            System.out.println(t);
            a = b;
            b = t;
        }
    }
}
