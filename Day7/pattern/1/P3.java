public class P3 {
    public static void Pattern() {
        int n=10;
        for ( int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        P3 square = new P3();

        square.Pattern();
    }
}
