package array_tech;

import java.util.Scanner;

public class A453 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("red") || s.equals("r")) {
                a[i] = 1;
            } else if (s.equals("blue") || s.equals("b")) {
                a[i] = 3;
            } else {
                a[i] = 2;
            }
        }
        int i = 0, j = n - 1;
        while (i < j && a[i] <= 2) {
            i = i + 1;
        }
        while (i < j && a[j] > 2) {
            j = j - 1;
        }
        if (a[j] > 2)
            j = j - 1;
        while (i < j) {
            if (a[i] <= 2) {
                i = i + 1;
            } else if (a[j] > 2) {
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
        for (i = 0; i < n; i++) {
            if (a[i] == 1)
                System.out.println("red");
            else if (a[i] == 2)
                System.out.println("white");
            else
                System.out.println("blue");
        }
    }
}
