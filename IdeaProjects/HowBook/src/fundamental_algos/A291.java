package fundamental_algos;

import java.util.Scanner;

import static java.lang.Math.pow;

//character string containing decimal point conversion to decimal
public class A291 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter characters");
        char s[] = new char[n];
        int flag = 0, i, j = 0, k = 0;
        double sum = 0.0;
        for (i = 0; i < n; i++)
            s[i] = sc.next().charAt(0);
        for (i = 0; i < n; i++) {
            if (s[i] == '.') {
                flag = 1;
                break;
            } else
                sum = sum * 10 + ((int) s[i] - 48);
        }
        if (flag == 1) {
            for (j = i + 1, k = 1; j < n; j++, k++) {
                System.out.println((int) s[j] - 48);
                sum = sum + ((double) ((int) s[j] - 48) / pow(10, k));
                System.out.println(sum + " " + j);
            }

        }
        System.out.printf("%." + k + "f", sum);
    }
}
