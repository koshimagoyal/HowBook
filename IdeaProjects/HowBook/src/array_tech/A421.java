package array_tech;

import java.util.Scanner;

public class A421 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of marks you want to enter");
        int n = sc.nextInt();
        int a[] = new int[101];
        for (int i = 0; i < 101; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a[m] = a[m] + 1;
        }
        System.out.println("array elements are");
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += a[i];
            if (i % 10 == 0) {
                System.out.print(sum);
                sum = 0;
                if (i % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
