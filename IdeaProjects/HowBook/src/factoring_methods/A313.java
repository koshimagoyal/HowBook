package factoring_methods;

import java.util.Scanner;

//find integer whose square is closest to but greater than input integer
public class A313 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int i = 0;
        for (i = 1; n > i * i; i++) ;
        System.out.println(i * i);
    }
}
