package factoring_methods;

import java.util.Scanner;

//compute smallest common multiple
public class A337 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int i, flag = 0;
        for (i = 1; i <= n + p; i++) {
            for (int j = 1; j <= n + p; j++) {
                if (p * i == n * j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        System.out.println(p * i);
    }
}
