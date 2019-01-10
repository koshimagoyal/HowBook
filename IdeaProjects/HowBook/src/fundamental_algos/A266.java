package fundamental_algos;

import fundamental_algos.A246;

import java.util.Scanner;

//f3=1!+0! f4=2!+1!....
public class A266 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        A246 ob = new A246();
        int a = ob.fact(0);
        int b = ob.fact(1);
        System.out.println(a + "\n" + b);
        for (int i = 2; i < n; i++) {
            int t = a + b;
            System.out.println(t);
            a = ob.fact(i);
            b = ob.fact(i - 1);
        }
    }
}
