package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 * Created by c4q-anthonyf on 3/8/15.
 */
import java.util.Scanner;

public class fruit {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fruit: ");

        String fruit = scanner.next();
        String color;
        String flavor;

        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        }
        else if (fruit.equals("orange")) {
            color = "orange";
            flavor = "tangy";
        }
        else {
            System.out.println("I don't know that fruit.");
            return;
        }
        System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);

    }

}
