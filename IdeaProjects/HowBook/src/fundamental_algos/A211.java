package fundamental_algos;

//swap liquid of glass A and glass B
public class A211 {

    public static void main(String args[]) {
        int c, a = 10, b = 20;
        System.out.println("Before swap a=" + a + " b=" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swap a=" + a + " b=" + b);
    }
}
