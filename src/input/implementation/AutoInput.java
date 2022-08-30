package input.implementation;

import input.Input;
import input.objects.CPU;

public class AutoInput extends Input {

    public AutoInput() {
        player1 = new CPU();
        player2 = new CPU();
    }

}
