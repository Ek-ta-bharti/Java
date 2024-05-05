import java.util.Scanner;

public class GuesserGame {

    private static int secretNumber;

    public static void guesser() {
        secretNumber = (int) (Math.random() * 10) + 1;
    }

    public static void umpire(String[] playerName, int[] playerGuess) {
        for (int i = 0; i < playerName.length; i++) {
            if (playerGuess[i] == secretNumber) {
                System.out.println("Congratulations, " + playerName[i] + "! You guessed the correct number ("
                        + secretNumber + ").");
                return;
            }
        }
        System.out.println("No one guessed the correct number (" + secretNumber + "). The game will restart.");
        main(null);
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Players want to play: ");
        int playernumber = sc.nextInt();
        sc.nextLine();
        String[] playerName = new String[playernumber];
        int[] playerGuess = new int[playernumber];

        System.out.println("Welcome to the Guesser Game!");
        System.out.println("========================================");

        for (int i = 0; i < playernumber; i++) {
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            playerName[i] = sc.nextLine();
            System.out.print("Enter Your Guess Number, " + playerName[i] + ": ");
            playerGuess[i] = sc.nextInt();
            sc.nextLine();
        }

        GuesserGame guesserA = new GuesserGame();
        guesserA.guesser();

        System.out.println("\nPlayer Name And Player GuessNumber: ");
        for (int i = 0; i < playernumber; i++) {
            System.out.println((i + 1) + ". " + playerName[i] + "- -> " + playerGuess[i]);
        }
        System.out.println("==================================================================");
        GuesserGame umpireA = new GuesserGame();
        umpireA.umpire(playerName, playerGuess);
        System.out.println("==================================================================");
        sc.close();
    }
}
