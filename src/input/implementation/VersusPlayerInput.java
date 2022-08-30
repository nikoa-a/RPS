package input.implementation;

import java.util.Scanner;

import game.Options;
import input.Input;
import input.objects.User;

public class VersusPlayerInput extends Input {

    public VersusPlayerInput(Options options, Scanner scan){
        player1 = new User(options, scan);
        player2 = new User(options, scan);
    }

}
