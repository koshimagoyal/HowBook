package array_tech;

import java.util.Scanner;

public class A441 {

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
        int i, j, k, l;
        for (i = 1; a[i - 1] != a[i] && i < n - 1; i++) ;
        if (a[i - 1] != a[i])
            i = i + 1;
        else {
            j = i - 1;
            while (i < n - 1) {
                i = i + 1;
                if (a[i - 1] != a[i]) {
                    for (k = j, l = i; l < n; k++, l++) {
                        a[k] = a[l];
                    }
                    n = k;
                    for (i = j + 1; a[i - 1] != a[i] && i < n - 1; i++) ;
                    j = i - 1;
                }
            }
            if (a[i - 1] == a[i])
                n = i - 1;
        }
        System.out.println("new array elements are");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
