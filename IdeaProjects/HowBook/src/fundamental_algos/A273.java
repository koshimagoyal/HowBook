package fundamental_algos;

import java.util.Scanner;

//converts digits into integer
public class A273 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < 5; i++)
            d[i] = sc.nextInt();
        System.out.println("digits are");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum * 10 + d[i];
            System.out.println(d[i]);
        }
        System.out.println(sum);
    }
}
