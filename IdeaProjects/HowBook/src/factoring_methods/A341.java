package factoring_methods;

import java.util.Scanner;

import static java.lang.Math.abs;

public class A341 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int p[] = new int[100];
        p[0] = 2;
        p[1] = 3;
        p[2] = 5;
        int i = 2;
        if (n < 5) {
            for (int j = 0; j < (n) / 2; j++) {
                System.out.println(p[j]);
            }
        } else {
            for (int k = 0; k < 3; k++) {
                System.out.println(p[k]);
            }
            int x = 5, plimsq = 25, limit = 2, dx = 2;
            boolean prime;
            int rootn = (int) Math.sqrt(plimsq);
            int multiple[] = new int[100];
            while (x < n) {
                x = x + dx;
                dx = abs(dx - 6);
                if (limit <= i) {
                    if (x >= plimsq) {
                        multiple[limit] = plimsq;
                        limit += 1;
                        if (limit <= i) {
                            plimsq = p[limit] * p[limit];
                        }
                    }
                    prime = true;
                    int j = 2;
                    while (prime && j < limit) {
                        int s = multiple[j];
                        while (s < x) {
                            s += p[j] * 2;
                        }
                        multiple[j] = s;
                        prime = x != multiple[j];
                        j = j + 1;
                    }
                    if (prime) {
                        System.out.println(x);
                        if (x <= rootn) {
                            i = i + 1;
                            p[i] = x;
                        }
                    }
                }
            }
        }
    }
}
