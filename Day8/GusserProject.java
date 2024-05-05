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


    void collectNumFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    void collectNumFromPlayers(){
        Player p1 =new Player();
        Player p2 =new Player();
        Player p3 =new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
    void compare(){
      if(numFromGuesser==numFromPlayer1){ 
        if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
            System.out.println("all are correct");
        }else if(numFromGuesser==numFromPlayer2){
            System.out.println("Player1 or Player2 won the game");
        }else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player1 or Player3 won the game");
        }else{
        System.out.println("Player1 won the game");
        }
      } else if(numFromGuesser==numFromPlayer2){
        if(numFromGuesser==numFromPlayer3 ){
            System.out.println("Player2 or Player3 won the game");
        }else{
            System.out.println("Player2  won the game");
        }
      }  else if(numFromGuesser==numFromPlayer3){
        System.out.println("Player3 won the game");
      }else {
        System.out.println("No one can be winner");
      }
    }
}

public class GusserProject {
    public static void main(String[] args) {
     System.out.println("GAME STARTED");
     Umpire u=new Umpire();
     u.collectNumFromGuesser();
     u.collectNumFromPlayers();
     u.compare();
    }
}
