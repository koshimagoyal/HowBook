package factoring_methods;

import java.util.Scanner;

public class A324 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = 1, mcount = 1;
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (mcount < count) {
                mcount = count;
                max = i;
            }
        }
        System.out.println("no having max divisors is " + max);
    }
}
