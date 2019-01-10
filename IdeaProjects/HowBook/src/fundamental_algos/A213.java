package fundamental_algos;

// swap such as a=b b=c c=d and d=a
public class A213 {

    public static void main(String args[]) {
        int a = 10, b = 20, c = 30, d = 40;
        System.out.println("Before swap a=" + a + " b=" + b + " c=" + c + " d=" + d);
        d = a + b + c + d;
        c = d - c - b - a;
        b = d - c - b - a;
        a = d - c - b - a;
        d = d - c - b - a;
        System.out.println("After swap a=" + a + " b=" + b + " c=" + c + " d=" + d);
    }
}
