package nyc.c4q.AnthonyFermin;

/**Anthony Fermin
 * pair programmed with Alvin
 *
 * Created by c4q-anthonyf on 3/8/15.
 */
import java.util.Scanner;


public class DayOfTheWeek {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day;

        System.out.print("Enter the day of the week: ");
        day = input.next();

        if(day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("mon")
                || day.equalsIgnoreCase("tuesday")
                || day.equalsIgnoreCase("tues")
                || day.equalsIgnoreCase("wednesday")
                || day.equalsIgnoreCase("wed")
                || day.equalsIgnoreCase("thursday")
                || day.equalsIgnoreCase("thurs")
                || day.equalsIgnoreCase("friday")
                || day.equalsIgnoreCase("mon"))
            System.out.println("It is a weekday");
        else if(day.equalsIgnoreCase("saturday")
                || day.equalsIgnoreCase("sat")
                || day.equalsIgnoreCase("sunday")
                || day.equalsIgnoreCase("sun"))
            System.out.println("It is the weekend");
        else
            System.err.println("What planet are you from????");


    }

}
