package fundamental_algos;

import java.util.Scanner;

//decimal to bcd
public class A284 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int count = 0, ans[] = new int[100], j = 0;
        while (n > 0) {
            int r = n % 10;
            while (count != 3) {
                int k = r % 2;
                ans[j] = k;
                count += 1;
                r = r / 2;
                j++;
            }
            j++;
            count = 0;
            n = n / 10;
        }
        for (int i = j - 1; i >= 0; i--)
            System.out.print(ans[i]);
    }
}
