package fundamental_algos;

import java.util.Scanner;

//1/n!
public class A241 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n = n - 1;
        }
        System.out.println(1 / (float) fact);
    }
}
