package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 *  paired with Alvin
 * Created by c4q-anthonyf on 3/8/15.
 * Keeps count of total MnMs even after the user eats them
 */
import java.util.Scanner;

public class MAndMs {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int MMs = 100;
        int eatMMs;

        while(MMs > 0){
            System.out.println(MMs + " M&Ms left");
            System.out.print("\neat how many? ");
            eatMMs = input.nextInt();

            if(eatMMs <= MMs && !(eatMMs < 0)) {
                MMs -= eatMMs;
            } else if (eatMMs < 0) {
                System.out.println("That's impossible! >_< ");
            }else{
                System.out.println("Can't do that, you have less than " + eatMMs + "!!");
            }


        }

        System.out.println("Ran out of M&Ms!!! (o_O)");
    }

}
