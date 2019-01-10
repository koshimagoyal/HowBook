package fundamental_algos;

import java.util.Scanner;

//swap i and a[i] element
public class A215 {

    void swap(int[] a, int n, int i) {
        int t = i; //int t=a[i];
        i = a[i]; //a[i]=i;
        a[i] = t; //i=t;
    }

    public static void main(String args[]) {
        int a[] = new int[5];
        System.out.println("enter array elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        System.out.println("Array elements");
        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("enter i to swap");
        int i = sc.nextInt();
        A215 obj = new A215();
        try {
            obj.swap(a, 5, i);
        } catch (Exception e) {
            System.out.println("enter i to swap");
            i = sc.nextInt();
            obj.swap(a, 5, i);
        }
        System.out.println("Array elements after swap");
        for (int j = 0; j < 5; j++)
            System.out.print(a[j] + " ");
    }

}
