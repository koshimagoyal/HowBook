package array_tech;

import java.util.Scanner;

public class A423 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float mean = 0, median = 0, sum = 0;
        int count = 0;
        System.out.println("enter number of marks you want to enter");
        int n = sc.nextInt();
        int a[] = new int[101];
        for (int i = 0; i < 101; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a[m] = a[m] + 1;
            sum = sum + (float) a[m];
            if (a[m] <= n / 2) {
                median = m;
            }
            count++;
        }
        mean = sum / count;
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
    }
}
