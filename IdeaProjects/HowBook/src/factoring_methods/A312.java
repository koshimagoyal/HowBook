package factoring_methods;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

//geometric mean
public class A312 {
    double root(double n, int b) {
        double e = 1e-3;
        double g2 = n / b, g1;
        do {
            g1 = g2;
            g2 = (g1 * 2 + n / pow(g1, 2)) / b;
        } while (abs(g1 - g2) > e);
        return g2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter elements");
        double p = 1;
        for (int i = 0; i < n; i++)
            p *= sc.nextDouble();
        A312 ob = new A312();
        System.out.println(ob.root(p, n));

    }
}
