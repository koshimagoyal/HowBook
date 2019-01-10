package fundamental_algos;

import java.util.Scanner;

//lucas sequence 1 3 4 7....
public class A262 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a = 1;
        int b = 3;
        System.out.println(a + "\n" + b);
        for (int i = 2; i < n; i++) {
            int t = a + b;
            System.out.println(t);
            a = b;
            b = t;
        }
    }
}
