package input.implementation;

import java.util.Scanner;

import game.Options;
import input.Input;
import input.objects.CPU;
import input.objects.User;

public class VersusBotInput extends Input {

    public VersusBotInput(Options options, Scanner scan) {
        player1 = new User(options, scan);
        player2 = new CPU(options);
    }

}
