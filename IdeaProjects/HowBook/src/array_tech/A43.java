package array_tech;

import java.util.Scanner;

public class A43 {
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
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i])
                max = a[i];
        }
        System.out.println("Maximum = " + max);
    }
}
