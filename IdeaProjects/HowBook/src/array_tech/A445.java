package array_tech;

import java.util.Scanner;

public class A445 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int t[] = new int[n],j=0;
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                t[j++]=a[i];
            }
        }
        t[j++]=a[n-1];
        System.out.println("array elements are");
        for (int i = 0; i < j; i++) {
            System.out.println(t[i]);
        }
    }
}
