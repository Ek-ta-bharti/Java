public class VariableExample2 {
    static int a = 10;

    void fun() {
        int b = 20;
        System.out.println(a + " " + b);
        ++a;
        ++b;
    }

    public static void main(String[] args) {
        VariableExample2 E = new VariableExample2();
        E.fun();
        E.fun();

    }

}
