import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Chatroom {

    public static boolean gate;


    public static void main( String[] args) {

        String out = "";
        String in = "";
        Chatbot chbt = new Chatbot();

        gate = true;
        System.out.println("\f");
        final Scanner scan = new Scanner(System.in);

        System.out.println(":)");

        while (gate) {
            in = scan.nextLine();
            out = chbt.ear(in);
            System.out.println(out);
            }
        }

    
    
    }
