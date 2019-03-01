package array_tech;

import java.util.Scanner;

public class A422 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of temperature you want to enter in range -40C to +5C");
        int n = sc.nextInt();
        int k = 46 - 5;
        int a[] = new int[101];
        for (int i = 0; i < 46; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m < -40 || m > 5) {
                System.out.println("out of range.....enter again");
                m = sc.nextInt();
                a[k + m - 1] += 1;
            } else {
                a[k + m - 1] += 1;
            }
        }
        System.out.println("array elements are");
        int sum = 0;
        for (int i = 0; i < 46; i++) {
            System.out.print(a[i]);
            if (i % 8 == 0) {
                System.out.println();
            }
        }
    }
}
