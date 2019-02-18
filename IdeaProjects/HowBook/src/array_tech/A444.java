package array_tech;

import java.util.Scanner;

public class A444 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements you want to enter");
        int n = sc.nextInt();
        int a[] = new int[n * n];
        int l = 0;
        for (int i = 0, t = 0; i < n; i++, l++) {
            int p = sc.nextInt();
            if (t == 0 || t == 1) {
                a[t] = p;
            } else if (a[t - 1] < p) {
                if (a[t - 2] < p) {
                    a[t] = p;
                }
            } else if (a[t - 1] > p) {
                if (a[t - 2] > p) {
                    a[t] = p;
                }
            }
            int j = 0, k = a[t];
            while (j != a[t]) {
                t = t + 1;
                a[t] = k;
                j = j + 1;
                l = l + 1;
            }
            t++;

        }
        System.out.println("Array elements are");
        for (int i = 0; i < l; i++) {
            System.out.println(a[i]);
        }
    }
}
