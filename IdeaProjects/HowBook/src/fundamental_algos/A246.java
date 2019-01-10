package fundamental_algos;

import java.util.Scanner;

public class A246 {

    int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n = n - 1;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        A246 a = new A246();
        System.out.println(a.fact(n) / (a.fact(r) * a.fact(n - r)));
    }
}
