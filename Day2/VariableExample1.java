public class VariableExample1 {
    static int b=10;
    int c= 20;
    public static void main(String[] args) {
        int a = 5;
        VariableExample1 ref = new VariableExample1();
        System.out.println(a);
        System.out.println(VariableExample1.b);
        System.out.println(ref.c);
    }
}
