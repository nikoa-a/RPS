package input.implementation;

import input.Input;
import input.objects.CPU;
import input.objects.User;

public class VersusBotInput extends Input {

    public VersusBotInput() {
        player1 = new User();
        player2 = new CPU();
    }

}
