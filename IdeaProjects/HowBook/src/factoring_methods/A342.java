package factoring_methods;

import java.util.Scanner;

public class A342 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int s[] = new int[n];
        int p, q, x, t = 0, j = 0, l, size = n - 1;
        for (int i = 0, a = 2; a <= n; i++, a++) {
            s[i] = a;
        }
        p = s[t];
        while (p * p <= n) {
            q = p;
            while (p * q <= n) {
                x = p * q;
                while (x <= n) {
                    for (int k = 0; k < size; k++) {
                        if (s[k] == x) {
                            for (l = k + 1; l < size; l++) {
                                s[l - 1] = s[l];
                            }
                            size = size - 1;
                        }
                    }
                    x = p * x;
                }
                j = j + 1;
                q = s[j];
            }
            t = t + 1;
            p = s[t];
        }
        System.out.println("prime numbers are");
        for (int i = 0; i < size; i++) {
            System.out.println(s[i]);
        }
    }
}
