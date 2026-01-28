import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //greeting player
        System.out.println("---Welcome to \"Bulls and Cows\"---");

        //variable for main screen logic
        int check = 1;


        while (check != 0) {
            System.out.println("1 - New Game");
            System.out.println("0 - Exit");
            check = scanner.nextInt();
            //loigc for start or exit
            switch (check) {
                case 1:
                    System.out.println("Game startsssss");
                    System.out.println("Do you wanna to set upper and lower bounds, or use default settings?");
                    int checkOne;
                    System.out.println("1 - Yes");
                    System.out.println("2 - No");
                    checkOne = scanner.nextInt();
                    if (checkOne == 1) {
                        int upperBound;
                        int lowerBound;
                        System.out.print("Set UpperBound : ");
                        upperBound = scanner.nextInt();
                        System.out.print("Set LowerBound : ");
                        lowerBound = scanner.nextInt();
                        Logic newGame = new Logic(upperBound, lowerBound);
                        System.out.println(newGame.getRandomNumber());
                        int playerNumber = -2;
                        while (playerNumber != -1){
                            System.out.println("To leave type: -1");
                            System.out.print("Type any number from " + newGame.getLowerBound() + " to " + newGame.getUpperBound() + ":");
                            playerNumber = scanner.nextInt();
                            System.out.println(newGame.playerToGuess(playerNumber));
                            if (newGame.playerWon() == true) {
                                playerNumber = -1;
                            }
                        }
                    } else if (checkOne == 2) {
                        Logic newGame = new Logic();
                        System.out.println(newGame.getRandomNumber());
                        int playerNumber = -2;
                        while (playerNumber != -1){
                            System.out.println("To leave type: -1");
                            System.out.print("Type any number from " + newGame.getLowerBound() + " to " + newGame.getUpperBound() + ":");
                            playerNumber = scanner.nextInt();
                            System.out.println(newGame.playerToGuess(playerNumber));
                            if (newGame.playerWon() == true) {
                                playerNumber = -1;
                            }
                        }

                    }
                    break;
                case 0:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }


    }
}
