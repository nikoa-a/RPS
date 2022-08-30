package input.objects;

import java.util.Random;

import game.Options;
import input.Player;

public class CPU implements Player {

    private Random rand;
    private Options options;

    public CPU(Options options) {
        rand = new Random();
        this.options = options;
    }

    public String option() {
        int index = rand.nextInt(options.getNumberOfOptions());
        String[] validOptions = options.validOptions();
        return validOptions[index];
    }
    
}
