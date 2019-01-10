package fundamental_algos;

import java.util.Scanner;

//factorial of n
public class A24 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n = n - 1;
        }
        System.out.println(fact);
    }
}
