import java.util.*;

class Guesser {
    int gusserNum;

    int guessingNumber() {
        System.out.println("Guesser! kindly guess the Number");
        Scanner scan = new Scanner(System.in);
        gusserNum = scan.nextInt();
        return gusserNum;
    }
}

class Player {
    int gusserNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! kindly guess the Number");
        gusserNum = scan.nextInt();
        return gusserNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("all are correct");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player1 or Player2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player1 or Player3 won the game");
            } else {
                System.out.println("Player1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 or Player3 won the game");
            } else {
                System.out.println("Player2  won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 won the game");
        } else {
            System.out.println("No one can be winner");
        }
    }
}

public class GusserProject {
    public static void main(String[] args) {
        System.out.println("GAME STARTED");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuesserGame extends JFrame {

    private int secretNumber;
    private JTextField[] guessFields;
    private JLabel[] guessLabels;

    public GuesserGame() {
        setTitle("Guesser Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2, 10, 10));

        JLabel playersLabel = new JLabel("How many Players want to play: ");
        JTextField playerNumberField = new JTextField();
        JButton startButton = new JButton("Start Game");

        add(playersLabel);
        add(playerNumberField);
        add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int playerNumber = Integer.parseInt(playerNumberField.getText());
                setupGame(playerNumber);
            }
        });
    }

    private void setupGame(int playerNumber) {
        getContentPane().removeAll();
        guessFields = new JTextField[playerNumber];
        guessLabels = new JLabel[playerNumber];

        for (int i = 0; i < playerNumber; i++) {
            JLabel nameLabel = new JLabel("Player " + (i + 1) + "'s name: ");
            JTextField nameField = new JTextField();
            JLabel guessLabel = new JLabel("Enter Your Guess Number, " + nameField.getText() + ": ");
            JTextField guessField = new JTextField();
            guessFields[i] = guessField;
            guessLabels[i] = guessLabel;
            add(nameLabel);
            add(nameField);
            add(guessLabel);
            add(guessField);
        }

        JButton submitButton = new JButton("Submit Guesses");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] playerGuesses = new int[playerNumber];
                String[] playerNames = new String[playerNumber];
                for (int i = 0; i < playerNumber; i++) {
                    playerGuesses[i] = Integer.parseInt(guessFields[i].getText());
                    playerNames[i] = guessLabels[i].getText().substring(25, guessLabels[i].getText().indexOf(":"));
                }
                umpire(playerNames, playerGuesses);
            }
        });

        revalidate();
        repaint();
    }

    private void umpire(String[] playerNames, int[] playerGuesses) {
        secretNumber = (int) (Math.random() * 10) + 1;
        boolean winner = false;

        for (int i = 0; i < playerNames.length; i++) {
            if (playerGuesses[i] == secretNumber) {
                JOptionPane.showMessageDialog(this, "Congratulations, " + playerNames[i]
                        + "! You guessed the correct number (" + secretNumber + ").");
                winner = true;
                break;
            }
        }

        if (!winner) {
            JOptionPane.showMessageDialog(this,
                    "No one guessed the correct number (" + secretNumber + "). The game will restart.");
            setupGame(playerNames.length);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuesserGame().setVisible(true);
            }
        });
    }
}
