import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("It's My Name: " + name);

        // Asking for the number of players
        System.out.print("How many players want to play? ");
        int numPlayers = scanner.nextInt();

        scanner.close();
    }
}
