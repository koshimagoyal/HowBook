package factoring_methods;

import java.util.Scanner;

//compute smallest common divisor other than 1
public class A338 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int j = 0, aa[] = new int[a], bb[] = new int[b], k = 0, n = 0, s = 0;
        A332 o = new A332();
        j = o.factor(a, aa, j);
        k = o.factor(b, bb, k);
        for (int i = 0; i < j; i++) {
            for (int l = 0; l < k; l++) {
                if (aa[i] == bb[l] && aa[i] != 1) {
                    n = 1;
                    s = aa[i];
                    break;
                }
            }
            if (n == 1)
                break;
        }
        System.out.println(s);
    }
}
