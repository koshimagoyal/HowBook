package fundamental_algos;

import java.util.Scanner;

//no of digits
public class A271 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int r = 0;
        System.out.println(n);
        while (n > 0) {
            r++;
            n = n / 10;
        }
        System.out.println(r);
    }
}
