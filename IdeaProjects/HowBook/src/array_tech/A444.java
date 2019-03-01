package array_tech;

import java.util.Scanner;

public class A444 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements you want to enter");
        int n = sc.nextInt();
        int a[] = new int[100];
        int l = 0,n1,n2=0,n3=0;
        for (int i = 0, t = 0; i < n; i++) {
            int p = sc.nextInt();
            n1=n2;
            n2=n3;
            n3=p;
            if (i == 0 || i == 1) {
                a[t] = p;
                l=l+1;
                int j = 0, k = a[t];
                while (j != a[t]) {
                    t = t + 1;
                    a[t] = k;
                    j = j + 1;
                    l = l + 1;
                }
                t++;
            } else if (n2 < p) {
                if (n1 < p) {
                    a[t] = p;
                    l=l+1;
                    int j = 0, k = a[t];
                    while (j != a[t]) {
                        t = t + 1;
                        a[t] = k;
                        j = j + 1;
                        l = l + 1;
                    }
                    t++;
                }
                else{
                    System.out.println("enter number in order");
                    n=n+1;
                    n3=n2;
                    n2=n1;
                }
            } else if (n2 > p) {
                if (n1 > p) {
                    a[t] = p;
                    l=l+1;
                    int j = 0, k = a[t];
                    while (j != a[t]) {
                        t = t + 1;
                        a[t] = k;
                        j = j + 1;
                        l = l + 1;
                    }
                    t++;
                }
                else{
                    System.out.println("enter number in order");
                    n=n+1;
                    n3=n2;
                    n2=n1;
                }
            }


        }
        System.out.println("Array elements are");
        for (int i = 0; i < l; i++) {
            System.out.println(a[i]);
        }
    }
}
