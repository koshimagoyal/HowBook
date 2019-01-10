package factoring_methods;

import java.util.Scanner;

//square root is not required to be calculated
public class A321 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Smallest divisor is 2");
        else {
            int d = 3, a;
            while (n % d != 0) {
                d = d + 2;
            }
            if (n % d == 0)
                a = d;
            else
                a = 1;
            System.out.println("Smallest divisor is " + a);
        }
    }
}
