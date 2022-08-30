import game.*;
import game.implementation.RPSSLGame;
import input.Input;
import input.implementation.*;

public class Main {

    public static void main(String[] args) {
        Input input = new AutoInput();   
        Game game = new RPSSLGame();

        while (game.running()) {
            String player1 = input.player1Input();
            String player2 = input.player2Input();

            System.out.println(player1);
            System.out.println(player2);

            
            game.play(player1, player2);
            game.score();
        }
    }

}
