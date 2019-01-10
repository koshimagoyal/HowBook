package fundamental_algos;

import java.util.Scanner;

//2+4+6..
public class A235c {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1, j = 2; i <= n; i++, j = j + 2)
            sum += j;
        System.out.println("Sum = " + sum);
    }
}
