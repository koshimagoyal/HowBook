package factoring_methods;

import java.util.Scanner;

//gcd algorithm that does not use either division or mod
public class A332 {
    int factor(int p, int[] pp, int r) {
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                pp[r] = i;
                r++;
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
        A332 o = new A332();
        j = o.factor(a, aa, j);
        k = o.factor(b, bb, k);
        for (int i = 0; i < j; i++) {
            for (int l = 0; l < k; l++) {
                if (aa[i] == bb[l]) {
                    if (n < aa[i]) {
                        n = aa[i];
                    }
                }
            }
        }
        System.out.println(n);
    }
}
