package array_tech;

import java.util.Scanner;

public class A438 {
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
        int max = a[0], min = a[0], max_count = 1, min_count = 1;
        for (int i = 1; i < n; i++) {
            if (max == a[i]) {
                max_count += 1;
            }
            if (min == a[i]) {
                min_count += 1;
            }
            if (max < a[i]) {
                max = a[i];
                max_count = 1;
            } else if (min > a[i]) {
                min = a[i];
                min_count = 1;
            }
        }
        System.out.println("Maximum = " + max + " Count = " + max_count + "\nMinimum = " + min + " Count = " + min_count);
    }
}
