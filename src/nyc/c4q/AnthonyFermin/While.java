package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/8/15.
 */
import java.util.Scanner;

public class While {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x = 10;

        while(x<= 100) {

            System.out.println("the number is " + x);
            System.out.println("What's the next number?");
            x = scanner.nextInt();

        }

    }

}
