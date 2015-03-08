package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/8/15.
 */

import java.util.Scanner;

public class emoticons {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String emotion;

        System.out.print("Enter your emoticon: ");
        emotion = input.next();

        if(emotion.equals(":)"))
            System.out.println("You are happy!");
        else if(emotion.equals(":("))
            System.out.println("You are sad....");
        else if(emotion.equals(":D"))
            System.out.println("You are excited!!!!!");
        else
            System.out.println("Sorry, that's not an emotion");





    }

}
