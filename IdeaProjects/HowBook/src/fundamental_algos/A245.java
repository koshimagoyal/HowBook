package fundamental_algos;

import java.util.Scanner;

public class A245 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = 0;
        if (m == 0 || n == 0)
            p = 0;
        else if (n < 0) {
            m = m + n;
            n = m - n;
            m = m - n;
        }
        for (int i = 0; i < n; i++)
            p += m;
        System.out.println(p);
    }
}
