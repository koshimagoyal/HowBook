package array_tech;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A414 {

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
        for (int i = 0, j = 0; i < n; i++) {
            if (i % 2 != 0) {
                int t = a[i];
                for (int k = i; k > j; k--)
                    a[k] = a[k - 1];
                a[j] = t;
                j++;
            }
        }
        System.out.println("reversed array");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
    }

}
