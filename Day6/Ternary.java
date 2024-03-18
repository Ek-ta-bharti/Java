package Day6;
public class Ternary {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 60;
        int result = (a < b) ? a : b;
        System.out.println(result);

        String res = (a < b) ? "a is less than b" : "b is greater than a";
        System.out.println(res);

        int num = (a < b) ? (a < c ? a : b) : (b < c ? b : c);
        System.out.println(num);

    }
}
