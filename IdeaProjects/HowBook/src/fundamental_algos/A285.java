package fundamental_algos;

import java.util.Scanner;

//decimal fraction to binary (0.625=0.101)
public class A285 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        double n = sc.nextDouble();
        int ans = 0, i = 0;
        float a;
        while (n > 0) {
            double p = n * 2;
            ans = ans * 10 + (int) p;
            n = n * 2 - (int) p;
            i++;
        }
        a = (float) ans;
        for (int c = 0; c < i; c++) {
            a = (float) a / 10;
        }
        System.out.printf("%." + i + "f", a);
    }
}
