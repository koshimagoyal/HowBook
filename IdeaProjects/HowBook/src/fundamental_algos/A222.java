package fundamental_algos;

//find no of +ve n -ve
public class A222 {

    public static void main(String args[]) {
        int a[] = {-1, 5, 4, -3, 5}, p = 0, n = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] > 0)
                p++;
            else if (a[i] < 0)
                n++;
        }
        System.out.println("No of positive = " + p);
        System.out.println("No of negative = " + n);
    }

}
