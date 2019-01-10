package fundamental_algos;

import java.util.Scanner;

import static java.lang.Math.floor;

//farey series
public class A265 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        double x0 = 0, y0 = 1, x1 = 1, y1 = n;
        System.out.println(x0 + "/" + y0 + "\n" + x1 + "/" + y1);
        double x = 0, y = 0;
        while (y != 1.0) {
            x = floor((y0 + n) / y1) * x1 - x0;
            y = floor((y0 + n) / y1) * y1 - y0;
            System.out.println(x + "/" + y);
            x0 = x1;
            x1 = x;
            y0 = y1;
            y1 = y;
        }
    }
}
