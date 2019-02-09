package array_tech;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A413 {

    public static void main(String args[]) throws Exception {
        int n;
        System.out.println("enter the size of array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());
        System.out.println("original array");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
        System.out.println("enter the kth place");
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < n / 2; i++, k++) {
            int t = a[i];
            a[i] = a[k - 1];
            a[k - 1] = t;
        }
        System.out.println("reversed array");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
    }

}
