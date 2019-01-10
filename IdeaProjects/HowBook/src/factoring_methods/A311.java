package factoring_methods;

import java.util.Scanner;

import static java.lang.Math.abs;

//find square root
public class A311 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        double n = sc.nextDouble();
        double e = 0.000001;
        double g2 = n / 2, g1;
        do {
            g1 = g2;
            g2 = (g1 + n / g1) / 2;
        } while (abs(g1 - g2) > e);
        System.out.println(g2);
    }
}
