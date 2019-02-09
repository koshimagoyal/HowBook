package factoring_methods;

import java.util.Scanner;

public class A34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println(n);
        int p[] = new int[n];
        p[1] = 2;
        p[2] = 3;
        p[3] = 5;
        int i = 3;
        if (n < 5) {
            for (int j = 1; j < (n + 1) / 2; j++) {
                System.out.println(p[j]);
            }
        } else {
            for (int j = 1; j <= 3; j++) {
                System.out.println(p[j]);
            }
        }
    }
}
