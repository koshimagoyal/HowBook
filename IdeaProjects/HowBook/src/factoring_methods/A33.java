package factoring_methods;

import java.util.Scanner;

//gcd of two numbers
public class A33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);
        System.out.println(a);
    }
}
