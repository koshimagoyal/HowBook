package fundamental_algos;

import java.util.Scanner;

//1-3+5-7....
public class A238 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1, j = 1; i <= n; i++, j = j + 2)
            if (i % 2 == 0)
                sum -= j;
            else
                sum += j;
        System.out.println("Sum = " + sum);
    }
}
