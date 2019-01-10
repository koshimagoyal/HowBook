package fundamental_algos;

import java.util.Scanner;

//a=0 b=1 c=1 d=sum of three predecessor
public class A263 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println(a + "\n" + b + "\n" + c);
        for (int i = 3; i < n; i++) {
            int t = a + b + c;
            System.out.println(t);
            a = b;
            b = c;
            c = t;
        }
    }
}
