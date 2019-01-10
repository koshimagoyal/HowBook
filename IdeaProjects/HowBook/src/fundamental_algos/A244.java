package fundamental_algos;

import java.util.Scanner;

//max factorial from factor of no
public class A244 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int fac, max = 0;
        int i, j;
        for (j = 1; j <= n; j++) {
            if (n % j == 0) {
                fac = 1;
                for (i = 1; i < j / 2; i++) {
                    fac *= i;
                    if (fac == j) {
                        if (max < j)
                            max = j;
                        break;
                    }
                }
            }

        }
        if (max != 0)
            System.out.println("Max factorial is " + max);
        else
            System.out.println("no factorial present");
    }
}
