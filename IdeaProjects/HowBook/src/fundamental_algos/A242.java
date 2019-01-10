package fundamental_algos;

import java.util.Scanner;

import static java.lang.Math.pow;

//x^n/n!
public class A242 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        System.out.println("enter x");
        int x = sc.nextInt();
        int fact = 1;
        int t = n;
        while (n > 0) {
            fact *= n;
            n = n - 1;
        }
        System.out.println(pow(x, t) / (float) fact);
    }
}
