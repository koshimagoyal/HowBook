package factoring_methods;

import java.util.Scanner;

//reducing multiples of 2 and then computing gcd
public class A334 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a - 2) % 2 == 0)
            a = a - 2;
        else if ((b - 2) % 2 == 0)
            b = b - 2;
        int r;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);
        System.out.println(a);
    }
}
