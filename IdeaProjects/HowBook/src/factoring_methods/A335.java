package factoring_methods;

import java.util.Scanner;

//all common prime divisors of two numbers
public class A335 {
    int prime_fact(int p, int[] pp, int r) {
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                int count = 0;
                for (int l = 2; l <= i; l++) {
                    if (i % l == 0)
                        count++;
                }
                if (count == 1) {
                    pp[r] = i;
                    r++;
                }
            }
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int j = 0, aa[] = new int[a], bb[] = new int[b], k = 0, n = 0;
        A335 o = new A335();
        j = o.prime_fact(a, aa, j);
        k = o.prime_fact(b, bb, k);
        for (int i = 0; i < j; i++) {
            for (int l = 0; l < k; l++) {
                if (aa[i] == bb[l]) {
                    System.out.print(aa[i] + " ");
                }
            }
        }
    }
}
