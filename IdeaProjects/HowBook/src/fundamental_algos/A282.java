package fundamental_algos;

import java.util.Scanner;

import static java.lang.Math.pow;

//binary to octal
public class A282 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no in binary");
        int n = sc.nextInt();
        double ans = 0;
        int j = 0, i = 0, count = 0;
        int b[] = new int[100];
        while (n > 0) {
            int r = n % 10;
            if (count == 3) {
                count = 0;
                i = 0;
                b[j] = (int) ans;
                j++;
                ans = 0;
            }
            ans = ans + (r * pow(2, i));
            i++;
            count++;
            n = n / 10;
        }
        b[j] = (int) ans;
        for (i = j; i >= 0; i--)
            System.out.print(b[i]);
    }
}
