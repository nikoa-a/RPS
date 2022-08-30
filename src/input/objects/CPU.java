package input.objects;

import java.util.Random;

public class CPU implements Player {

    Random rand;

    public CPU() {
        rand = new Random();
    }

    public String option() {
        String[] options = new String[] {
            "kivi", "paperi", "sakset"
        };
        int index = rand.nextInt(3);
        return options[index];
    }
    
}
