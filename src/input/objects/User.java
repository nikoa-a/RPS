package input.objects;

import java.util.Scanner;

import input.Player;

public class User implements Player {
    
    Scanner scan;

    public User() {
        scan = new Scanner(System.in);
    }

    public String option() {
        String input = "";
        while (incorrectFormat(input)) {
            System.out.print("kivi, paperi, sakset: ");
            input = scan.nextLine();       
        }
        return input;
    }

    protected boolean incorrectFormat(String input) {
        if (input.equals("kivi") ||
            input.equals("sakset") ||
            input.equals("paperi")) {
            return false;
        }
        return true;
    }

}
