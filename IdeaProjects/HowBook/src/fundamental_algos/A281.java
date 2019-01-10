package fundamental_algos;

import java.util.Scanner;

//decimal to any base
public class A281 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no and base");
        int n = sc.nextInt();
        int b = sc.nextInt();
        int count = 0, ans[] = new int[100];
        char h[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        while (n > 0) {
            int r = n % b;
            ans[count] = r;
            count += 1;
            n = n / b;
        }
        for (int i = count - 1; i >= 0; i--) {
            if (ans[i] >= 10) {
                for (int j = 0; j < 6; j++) {
                    if (ans[i] - 10 == j)
                        System.out.print(h[j]);
                }
            } else
                System.out.print(ans[i]);
        }
    }
}
