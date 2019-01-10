package fundamental_algos;

import java.util.Scanner;

//sum digits of integer
public class A272 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0, r = 0;
        System.out.println(n);
        while (n > 0) {
            r = n % 10;
            sum += r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
