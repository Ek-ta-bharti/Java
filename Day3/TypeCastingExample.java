package Day3;

public class TypeCastingExample {
    public static void main(String[] args) {
        int a = 29;
        double b;
        b = a;
        System.out.println(b);

        double s = 893.3;
        int e;
        e = (int) s;
        System.out.println(e);

        int n = 12;
        int m = 5;
        float res = n / m;
        System.out.println(res); // 2.0
    }
}
