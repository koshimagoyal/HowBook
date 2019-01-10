package factoring_methods;

import java.util.Scanner;

//compute sum in terms of smallest common denominator
public class A339 {
    int gcd(int c, int d) {
        int r;
        do {
            r = c % d;
            c = d;
            d = r;
        } while (r != 0);
        return c;
    }

    void low_form(int a, int b) {
        int cf = gcd(a, b);
        a = a / cf;
        b = b / cf;
        System.out.println(a + "/" + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two fractions in form a/b and c/d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        A339 o = new A339();
        int q = o.gcd(b, d);
        q = (b * d) / q;
        int n = (a * (q / b)) + (c * (q / d));
        o.low_form(n, q);
    }
}
