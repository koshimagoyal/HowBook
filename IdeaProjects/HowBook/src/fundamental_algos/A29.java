package fundamental_algos;

import java.util.Scanner;

//character to decimal (1,9,8,4 = 1984)
public class A29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter characters");
        char s[] = new char[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
            sum = sum * 10 + ((int) s[i] - 48);
        }
        System.out.println(sum);
    }
}
