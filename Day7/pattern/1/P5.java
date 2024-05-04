
public class P5 {
    public static void Pattern() {
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P5 square = new P5();
        square.Pattern();
    }
}
