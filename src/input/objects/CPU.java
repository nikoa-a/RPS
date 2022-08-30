package input.objects;

import java.util.Random;

import input.Player;

public class CPU implements Player {

    Random rand;

    public CPU() {
        rand = new Random();
    }

    public String option() {
        String[] options = new String[] {
            "kivi", "paperi", "sakset", "spock", "lisko"
        };
        int index = rand.nextInt(5);
        return options[index];
    }
    
}
