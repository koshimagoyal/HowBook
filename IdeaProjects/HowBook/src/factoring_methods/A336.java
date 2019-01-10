package factoring_methods;

import java.util.Scanner;

//test adjacent no do not share a common divisor greater than 1
public class A336 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int max = 1, flag = 0;
        for (int i = 1; i <= n; i++) {
            int r, a = i, b = i + 1;
            do {
                r = a % b;
                a = b;
                b = r;
            } while (r != 0);
            if (max < a) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("adjacent numbers have gcd greater than 1");
        else
            System.out.print("adjacent numbers do not have gcd greater than 1");
    }
}
