package array_tech;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//exchanging n times will exchange elements again i.e. 2 times reverse will happen leading to original array again

public class A411 {

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
        for (int i = 0; i < n; i++) {
            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        System.out.println("reversed array");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
    }

}
