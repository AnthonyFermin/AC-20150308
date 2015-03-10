package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/9/15.
 */
import java.util.Scanner;

public class exitTicket {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String response;
        boolean stillAsking = true;

        while(stillAsking){
            System.out.println("What should I do next?");
            response = input.nextLine();
            if(response.equals("exit") || response.equals("quit")) {
                stillAsking = false;
            }

        }

    }

}
