package factoring_methods;

import java.util.Scanner;

//gcd using while loop
public class A331 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = a % b;
        a = b;
        b = r;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}
