package array_tech;

import java.util.Scanner;

public class A445 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array elements are");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
