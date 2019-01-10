package fundamental_algos;

import java.util.Scanner;

//is factorial no or not
public class A243 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int fac = 1, flag = 0;
        int i;
        for (i = 1; i < n / 2; i++) {
            fac *= i;
            if (fac == n) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("it is factorial of " + i);
        else
            System.out.println("it is not factorial no");
    }
}
