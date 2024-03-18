package Day6;
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a == b && a > b && a < c);
        System.out.println(a < b && c > b && a <= c && b < c);
        System.out.println(a == b || a < b || a > b);
        System.out.println(a == b || b < a || a == c || a > c);
        System.out.println(!false);
        System.out.println(!true);
    }
}
