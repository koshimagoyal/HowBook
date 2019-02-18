package array_tech;

import java.util.Scanner;

public class A44 {

    public static void main(String[] args) {
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
        int i, j;
        for (i = 1; a[i - 1] != a[i] && i < n - 1; i++) ;
        if (a[i - 1] != a[i])
            i = i + 1;
        else {
            j = i - 1;
            while (i < n - 1) {
                i = i + 1;
                if (a[i - 1] != a[i]) {
                    j = j + 1;
                    a[j] = a[i];
                }
            }
            n = j + 1;
        }
        System.out.println("new array elements are");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
