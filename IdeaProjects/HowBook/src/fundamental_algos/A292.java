package fundamental_algos;

import java.util.Scanner;

//decimal to character string conversion
public class A292 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal");
        int n = sc.nextInt();
        int i = 0;
        char s[] = new char[20];
        while (n > 0) {
            int r = n % 10;
            s[i] = (char) (r + 48);
            n = n / 10;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(s[j] + " ");
    }
}
