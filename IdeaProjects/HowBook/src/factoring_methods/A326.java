package factoring_methods;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;
//fermat factorization algorithm

public class A326 {
    boolean isSquare(long b) {
        long s = (long) sqrt(b);
        if (s * s == b || (s + 1) * (s + 1) == b)
            return true;
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        long a = (long) ceil(sqrt(n));
        long b = a * a - n;
        A326 o = new A326();
        while (!o.isSquare(b)) {
            a = a + 1; //equivalently: b = b+2*a+1
            b = a * a - n; // a=a+1
        }
        System.out.println(a + (long) sqrt(b));//a-sqrt(b)
    }
}
