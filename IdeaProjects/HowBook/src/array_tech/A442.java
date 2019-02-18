package array_tech;

import java.util.Scanner;

public class A442 {

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
        System.out.println("enter the no for which you want to delete element");
        int i, j, k, l, p, q;
        k = sc.nextInt();
        for (i = 1; a[i - 1] != a[i] && i < n - 1; i++) ;
        if (a[i - 1] != a[i])
            i = i + 1;
        else {
            l = 2;
            j = i - 1;
            while (i < n - 1) {
                i = i + 1;
                if (a[i - 1] != a[i]) {
                    if (l == k) {
                        for (p = j, q = i; q < n; p++, q++) {
                            a[p] = a[q];
                        }
                        n = p;
                        for (i = j + 1; a[i - 1] != a[i] && i < n - 1; i++) ;
                        l = 2;
                        j = i - 1;
                    } else {
                        l = 1;
                        j = i;
                    }
                } else {
                    l++;
                }
            }
            if (a[i - 1] == a[i] && l == k) {
                for (p = j, q = i; q < n; p++, q++) {
                    a[p] = a[q];
                }
                n = p - 1;
            }
        }
        System.out.println("new array elements are");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
