public class P3 {
    public static void Pattern() {
        int i = 10;
        int j = 5;
        for (j = 0; j < 5; j++) {
            for (i = 0; i < 10; i++) {
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
