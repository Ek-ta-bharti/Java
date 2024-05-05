

public class P7 {
    public static void Pattern() {
        int n = 10; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i-j == (n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        P7 square = new P7();
        square.Pattern();
    }
}

