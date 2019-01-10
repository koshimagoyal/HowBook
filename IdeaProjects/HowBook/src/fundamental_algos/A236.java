package fundamental_algos;

import java.util.Scanner;

import static java.lang.Math.pow;

//1 2 4 8 without multiplication
public class A236 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println((int) pow(2, i));
    }
}
