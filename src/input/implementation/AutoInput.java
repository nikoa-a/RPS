package input.implementation;

import game.Options;
import input.Input;
import input.objects.CPU;

public class AutoInput extends Input {

    public AutoInput(Options options) {
        player1 = new CPU(options);
        player2 = new CPU(options);
    }

}
