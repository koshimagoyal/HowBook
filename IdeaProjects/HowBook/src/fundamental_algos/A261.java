package fundamental_algos;

import java.util.Scanner;

//func fibonacci series
public class A261 {
    int fib(int a, int b) {
        int t = a + b;
        return t;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 2; i < n; i++) {
            A261 obj = new A261();
            int c = obj.fib(a, b);
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
