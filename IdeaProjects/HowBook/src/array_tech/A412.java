package array_tech;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A412 {
    public static void main(String args[]) throws Exception {
        int n;
        System.out.println("enter the size of array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());
        System.out.println("original array");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
        System.out.println("reversed array");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
    }
}
