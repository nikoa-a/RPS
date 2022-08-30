package game.implementation;

import game.Game;
import game.objects.RPSSL;

public class RPSSLGame extends Game {

    public RPSSLGame() {
        options = new RPSSL();
    }

    public void play(String player1, String player2) {
        switch (result(player1, player2)) {
            case 1:
            case 3:
                player1Points++;
                break;
            case 2:
            case 4:
                player2Points++;
                break;
        }
    }
        
}
