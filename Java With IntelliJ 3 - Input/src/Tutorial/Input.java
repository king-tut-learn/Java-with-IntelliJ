package Tutorial;
//must import this to use Scanner
import java.util.*;

public class Input{

    public static void main(String [] args)
    {
        // Declare the Scanner
       Scanner input = new Scanner(System.in);

       //Making use of the Scanner
       System.out.print("Enter your full name: ");
       String name = input.nextLine();

        // Printing out the input you put in
       System.out.println("Hello " + name);


    }

}
