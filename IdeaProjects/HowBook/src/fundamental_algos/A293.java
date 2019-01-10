package fundamental_algos;

import java.util.Scanner;

public class A293 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter characters");
        char s[] = new char[n], p;
        int j = 0;
        for (int i = 0; i < n; i++) {
            p = sc.next().charAt(0);
            int k = (int) p - 48;
            if (k < 128) {
                s[i] = p;
                j++;
            }
        }
        for (int i = 0; i < j; i++)
            System.out.print(s[i] + " ");
    }
}
