import java.util.Scanner;

public class GuesserGame {

    public static void guesser() {
        int secretNumber = (int) (Math.random() * 100) + 1;
    }

    public static void umpire() {

    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Player Want To Play: ");
        int playernumber = sc.nextInt();
        sc.nextLine();
        String[] playerName = new String[playernumber];
        int[] playerGuess = new int[playernumber];

        for (int i = 0; i < playernumber; i++) {
            System.out.print("Enter player " + ((i + 1) + "'s name: "));
            playerName[i] = sc.nextLine();
            System.out.print("Enter Your Guesse Number " + playerName[i] + ": ");
            playerGuess[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\nPlayer Name And Player GuessNumber: ");
        for (int i = 0; i < playernumber; i++) {
            System.out.println((i + 1) + ". " + playerName[i] + "- -> " + playerGuess[i]);
        }
        sc.close();

        GuesserGame umpireA = new GuesserGame();
        GuesserGame guesserA = new GuesserGame();
        guesserA.guesser();
        umpireA.umpire();
    }

}
