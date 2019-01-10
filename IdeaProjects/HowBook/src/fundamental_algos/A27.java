package fundamental_algos;

import java.util.Scanner;

//reverse digits
public class A27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int rev = 0, r = 0;
        System.out.println(n);
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
