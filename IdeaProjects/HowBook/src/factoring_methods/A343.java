package factoring_methods;

import java.util.Scanner;

import static java.lang.Math.abs;

public class A343 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int p[] = new int[n];
        p[0] = 1;
        p[1] = 3;
        p[2] = 5;
        int l = 3;
        for (int k = 0; k < 3; k++) {
            System.out.println(p[k]);
        }
        int x = 5, dx = 2;
        while (x < n) {
            x = x + dx;
            dx = abs(dx - 6);
            System.out.println(x);
        }
    }
}
