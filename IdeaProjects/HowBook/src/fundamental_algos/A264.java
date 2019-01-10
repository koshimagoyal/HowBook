package fundamental_algos;

import java.util.Scanner;

//find d and e are part of fibonacci series
public class A264 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter d and e");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int a = 0;
        int b = 1;
        int flag = 0;
        for (int i = 2; i <= 100; i++) {
            if (d == a && e == b) {
                flag = 1;
                break;
            } else {
                int t = a + b;
                a = b;
                b = t;
            }
        }
        if (flag == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
