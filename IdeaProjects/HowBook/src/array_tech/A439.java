package array_tech;

import java.util.Scanner;

public class A439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Array elements are");
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        int max = 0, min = 0;
        if (a[0] > a[1]) {
            max = a[0];
            min = a[1];
        } else {
            max = a[1];
            min = a[0];
        }
        for (int i = 2; i < n; i += 2) {
            if (a[i] > a[i + 1]) {
                if (max < a[i]) {
                    max = a[i];
                }
                if (min > a[i + 1]) {
                    min = a[i + 1];
                }
            } else {
                if (max < a[i + 1]) {
                    max = a[i + 1];
                }
                if (min > a[i]) {
                    min = a[i];
                }
            }
        }
        System.out.println("Maximum = " + max + "\nMinimum = " + min);
    }
}
