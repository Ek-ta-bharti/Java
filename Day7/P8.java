
public class P8 {
    public static void Pattern() {
        int n = 10; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j-i == (n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        P8 square = new P8();
        square.Pattern();
    }
}
