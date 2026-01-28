import java.util.Random;
public class Logic {
    protected int randomNumber;
    protected String randomNumberString;
    protected boolean win;
    protected int upperBound;
    protected int lowerBound;

    Logic() {
        this.upperBound = 150;
        this.lowerBound = 100;
        this.randomNumber = (int)(Math.random() * (this.upperBound - this.lowerBound + 1)) + this.lowerBound;
        this.randomNumberString = String.valueOf(randomNumber);
    }
    Logic(int upperBound, int lowerBound) {
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        this.randomNumber = (int)(Math.random() * (this.upperBound - this.lowerBound + 1)) + this.lowerBound;
        this.randomNumberString = String.valueOf(randomNumber);
    }
    public int getUpperBound() {
        return this.upperBound;
    }
    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getRandomNumber() {
        return  this.randomNumber;
    }
    public boolean playerWon() {
        return this.win;
    }
    public String playerToGuess(int randomNumber) {
        String randomNumberString = String.valueOf(randomNumber);
        String answer = "";
        int[] foundIndex = new int[randomNumberString.length()];
        int counter = 0;
        if (randomNumber >= this.lowerBound && randomNumber <= this.upperBound && this.randomNumberString.length() == randomNumberString.length()) {
            for (int i = 0; i < randomNumberString.length(); i++) {
                if (randomNumberString.charAt(i) == (this.randomNumberString.charAt(i)) && !(foundIndex[i] == 1)) {
                    answer = answer + randomNumberString.charAt(i) + " - Bulls | ";
                    counter++;
                    foundIndex[i] = 1;
                } else {
                    for (int j = 0; j < randomNumberString.length(); j++) {
                        if (randomNumberString.charAt(i) == (this.randomNumberString.charAt(j))) {
                                if(!(foundIndex[j] == 1)){
                                    answer = answer + randomNumberString.charAt(i) + " - Cows | ";
                                }

                        }
                    }
                }
            }
        } else {
            System.out.println("Please, enter number between " + this.upperBound + " - " + lowerBound);
        }
        if (counter == this.randomNumberString.length()) {
            this.win = true;
            return "You won!";
        }
        return answer;
    }
}
