package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 * Program experiments with truth tables
 * Created by c4q-anthonyf on 3/8/15.
 */
import java.util.Scanner;

public class TruthTable {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //OR table
        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println();

        //XOR or exclusive or table
        System.out.println("true  ^ true  = " + (true ^ true));
        System.out.println("true  ^ false = " + (true ^ false));
        System.out.println("false ^ true  = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println();

        //NOT table
        System.out.println("!true  = " + !(true));
        System.out.println("!false = " + !(false));
        System.out.println();

        //AND table
        System.out.println("true  && true  = " + (true && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println();

        //NOT equal
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("x != 12 is " + (x != 12));
        System.out.println();

        String s = "grapefruit";
        System.out.println(!s.equals("pineapple"));
        System.out.println();




    }

}
