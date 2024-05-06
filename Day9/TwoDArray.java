public class TwoDArray {
    public static void main(String[] args) {
        int card[][] = new int[3][2];
        card[0][0] = 5;
        card[0][1] = 2;
        card[1][0] = 7;
        card[1][1] = 3;
        card[2][0] = 1;
        card[2][1] = 4;

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                System.out.print(card[i][j] + " ");
            }
            System.out.println();
        }
    }
}
