package Main;

import java.util.Scanner;
import static Main.SupportChecker.*;
import static Main.MathOperators.*;


public class StringCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        longProberka(str);
        mathProverka(str);
        stringProverka(str);


        str = str.replace("\"", "");

        add(str);
        sub(str);
        mult(str);
        div(str);
    }
}



