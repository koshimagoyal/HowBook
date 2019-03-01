package array_tech;

import java.util.Scanner;

public class A452 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the x");
        int x = sc.nextInt();
        int i = 0, j = n - 1;
        while (i < j && a[i] <= x) {
            i = i + 1;
        }
        while (i < j && a[j] > x) {
            j = j - 1;
        }
        if (a[j] > x)
            j = j - 1;
        while (i < j) {
            if (a[i] <= x) {
                i = i + 1;
            } else if (a[j] > x) {
                j = j - 1;
            } else {
                int t;
                t = a[i];
                a[i] = a[j];
                a[j] = t;
                i = i + 1;
                j = j - 1;
            }
        }
        int p = j;
        System.out.println("no less than equal to 17");
        for (i = 0; i < p; i++) {
            for (j = i + 1; j <= p; j++) {
                if (a[j] < a[i]) {
                    int t;
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        for (i = 0; i <= p; i++) {
            System.out.println(a[i]);
        }
        System.out.println("no greater than equal to 17");
        for (i = p + 1; i < n; i++)
            System.out.println(a[i]);
    }
}
