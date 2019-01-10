package fundamental_algos;

//swap such as a=c b=a c=b
public class A212 {

    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        System.out.println("Before swap a=" + a + " b=" + b + " c=" + c);
        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
        System.out.println("After swap a=" + a + " b=" + b + " c=" + c);
    }
}
