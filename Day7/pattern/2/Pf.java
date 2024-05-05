
public class Pf {
    public static void fullPattern() {
        int n = 10;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (i >= n - j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pf dark = new Pf();
        dark.fullPattern();
    }
}
