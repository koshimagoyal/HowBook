package fundamental_algos;

//swap two elements without third variable
public class A214 {

    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("Before swap a=" + a + " b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap a=" + a + " b=" + b);
    }
}
