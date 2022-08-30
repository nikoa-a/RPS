package input.objects;

import java.util.Scanner;

import game.Options;
import input.Player;

public class User implements Player {
    
    private Scanner scan;
    private Options options;

    public User(Options options, Scanner scan) {
        this.options = options;
        this.scan = scan;
    }

    public String option() {
        String input = "";
        while (incorrectFormat(input)) {
            System.out.print(String.join(", ", options.validOptions()) + ": ");
            input = scan.nextLine();       
        }
        return input;
    }

    protected boolean incorrectFormat(String input) {
        for (String option : options.validOptions()) {
            if (option.equals(input)) {
                return false;
            }
        }
        return true;
    }

}
