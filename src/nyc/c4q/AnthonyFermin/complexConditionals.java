package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/8/15.
 */
import java.util.Scanner;

public class complexConditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = input.nextInt();
        if (score == 100)
            System.out.println("Perfect score!");
        else if (score >= 90)
            System.out.println("Great!");
        else if (score >= 75)
            System.out.println("Not bad!");
        else if (score >= 60)
            System.out.println("You passed.");
        else
            System.out.println("You failed. :(");

    }

}
