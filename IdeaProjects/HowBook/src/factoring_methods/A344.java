package factoring_methods;

import java.util.Scanner;

//Mersenne primes

public class A344 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int l[] = new int[100];
        l[0] = 4;
        int p = 3;
        int x = (int) Math.pow(2, p) - 1;
        while (x < n) {
            for (int i = 1; i <= p - 2; i++) {
                l[i] = ((l[i - 1] * l[i - 1]) - 2) % x;
            }
            if (l[p - 2] == 0)
                System.out.println(x);
            p = p + 1;
            x = (int) Math.pow(2, p) - 1;
        }
    }
}
