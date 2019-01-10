package factoring_methods;

import java.util.Scanner;

//gcd of n positive non-zero integers
public class A333 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int r, a = i, b = i + 1;
            do {
                r = a % b;
                a = b;
                b = r;
            } while (r != 0);
            if (max < a)
                max = a;
        }
        System.out.println(max);
    }
}
