package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 * pair programmed with Alvin
 * Created by c4q-anthonyf on 3/8/15.
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1000) + 1;
        int guess = 0;
        int count = 0;
        boolean stillPlaying = true;

        //continues game loop while stillPlaying is true
        while(stillPlaying){

            System.out.print("Guess a number from 1 to 1000: ");
            guess = input.nextInt();

            if(guess > number && guess < 1000) {
                System.out.println("Number is too high. Try again.\n");
                count += 1;
            }
            else if(guess < number && guess > 0) {
                System.out.println("Number is too low. Try again.\n");
                count += 1;
            }
            else if (guess != number)
                System.out.println("Number is not within desired range. Try again.\n");
            else{
                System.out.println("That's right!! It took you " + count + " guesses!");
                stillPlaying = false;
            }


        }



    }

}
