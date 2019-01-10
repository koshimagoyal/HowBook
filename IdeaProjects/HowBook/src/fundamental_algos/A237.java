package fundamental_algos;

import java.util.Scanner;

//1 -1 1 -1....
public class A237 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)
                System.out.print("-1 ");
            else
                System.out.print("1 ");
    }
}
