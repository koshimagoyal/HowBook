package fundamental_algos;

import java.util.Scanner;

import static java.lang.Math.pow;

//any base to decimal (more general)
public class A283 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no and its base");
        String n = sc.next();
        int b = sc.nextInt();
        char l[] = n.toCharArray();
        double ans = 0;
        for (int i = l.length - 1, j = 0; i >= 0; i--, j++) {
            if (l[i] == 'A')
                ans = ans + (10 * pow(b, j));
            else if (l[i] == 'B')
                ans = ans + (11 * pow(b, j));
            else if (l[i] == 'C')
                ans = ans + (12 * pow(b, j));
            else if (l[i] == 'D')
                ans = ans + (13 * pow(b, j));
            else if (l[i] == 'E')
                ans = ans + (14 * pow(b, j));
            else if (l[i] == 'F')
                ans = ans + (15 * pow(b, j));
            else
                ans = ans + (Character.getNumericValue(l[i]) * pow(b, j));
        }
        System.out.println(ans);
    }
}
