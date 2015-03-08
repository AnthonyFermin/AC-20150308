package nyc.c4q.AnthonyFermin;

/**Anthony Fermin
 * paired with Alvin
 * Created by c4q-anthonyf on 3/8/15.
 * Asks user for emotion, compares to smileys we know and replies with corresponding emotion
 */

import java.util.Scanner;

public class emoticons {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String smiley;

        System.out.print("Enter your emoticon: ");
        smiley = input.next();


        //compares emotion variable with emoticon string and replies with emotion
        if(smiley.equals(":)"))
            System.out.println("You are happy!");
        else if(smiley.equals(":("))
            System.out.println("You are sad....");
        else if(smiley.equals(":D"))
            System.out.println("You are excited!!!!!");
        else
            System.out.println("Sorry, that's not an emotion");

    }

}
