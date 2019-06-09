package sample;

/*		BUG EXERCISE 2
	In the code, there are two compilation errors.
	Find the errors, document the errors, then fix the errors.
*/

import java.util.Scanner; //need Scanner and Random
import java.util.Random;

public class Bug2{
    public static void main(String[] args){
        System.out.println("Welcome to Java RPS!");
        int numRounds = getRounds();
        int currentRound = 1;           //variable initialization
        int playerScore = 0;
        int compScore = 0;
        int tieScore = 0;

        while (currentRound <= numRounds){      //to do for each round
            System.out.println("---Round " + currentRound + " of " + numRounds + " - RPS!"); //print current and total rounds
            String result = roundResult(getPlayerMove(), getCompMove());    //get player and comp move and pass to roundResult
            //save as "result"
            if (result.equals("player")){       //check who won
                playerScore++;
                System.out.println("**Player wins the round!");
            } else if (result.equals("computer")){
                compScore++;
                System.out.println("**Computer win the round!");
            } else {                            //if no one won (or if for some reason it returns somethign else)
                tieScore++;
                System.out.println("**Tie round!");
            }
            //print out scores at the end of each round
            System.out.println("Player: " + playerScore + " Computer: " + compScore + " Ties: " + tieScore);
            currentRound++;     // move on to the next round
        }

        printWinner(playerScore, compScore); //show winning message
    }
    /*
    this method will show the winner based on the player and computer scores passed to it
    */
    public static void printWinner(int pScore, int cScore){
        if (pScore > cScore){
            System.out.println("***Player wins!***");
        } else if (pScore == cScore){
            System.out.println("***Tie game!***");
        } else {
            System.out.println("***Computer wins!***");
        }
    }
    /*
    This method will return a string depending on the move passed to it.  All moves are
    assumed to be single letter strings, and lowercase.  It will return "player" if the
    player wins, "computer" if the computer wins, or "tie" if they have the same value.
    */
    public static String roundResult(String pMove, String cMove){
        System.out.println("Player chose: " + pMove);
        System.out.println("Comp chose: " + cMove);
        if (pMove.equals(cMove)){
            return "tie";
        } else if ((pMove.equals("r") && cMove.equals("s")) ||
                (pMove.equals("s") && cMove.equals("p")) ||
                (pMove.equals("p") && cMove.equals("r"))){
            return "player";
        } else {
            return "computer";
        }
    }
    /*
    This method will return an int representing a user-chosen # of rounds
    */
    public static int getRounds(){
        Scanner inp = new Scanner(System.in);
        System.out.print("How many rounds would you like to play? ");
        return inp.nextInt();
    }
    /*
    This method will return a String representing a user-chosen move. Although it
    does not check, the string should be a single letter and lowercase.
    */
    public static String getPlayerMove(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your move (r,p,s): ");
        return inp.nextLine();
    }
    /*
    This method will return a String representing the computer move. A random
    number is generated from 1-3 inclusive and each one is mapped to r, p, or s.
    */
    public static String getCompMove(){
        Random rand = new Random();
        int num = rand.nextInt(3)+1;
        if (num == 1) return "r";
        if (num == 2) return "p";
        return "s";
    }
}
