package factoring_methods;

import java.util.Scanner;

//finds smallest positive number that has n or more divisors
public class A323 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int count = 1, i = 1;
        while (count != n) {
            i++;
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
        System.out.println(i);
    }
}
