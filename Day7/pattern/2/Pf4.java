package Day8;

public class Pf4 {
    public static void pattern() {
        int n = 10;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n * 2 - 1; i++) {
                if (i < n - j - 1 || i >= n + j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pf4 star = new Pf4();
        star.pattern();
    }
}
