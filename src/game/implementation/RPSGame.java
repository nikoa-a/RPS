package game.implementation;

import game.Game;
import game.objects.RPS;

public class RPSGame extends Game {
    
    public RPSGame() {
        options = new RPS();
    }

    public void play(String player1, String player2) {
        switch (result(player1, player2)) {
            case 1:
                player1Points++;
                break;
            case 2:
                player2Points++;
                break;
        }
    }

    private int result(String player1, String player2) {
        int player1Int = options.optionNumber(player1);
        int player2Int = options.optionNumber(player2);
        
        int diff = player1Int - player2Int;
        if (diff < 0) {
            diff += 3;
        }
        return diff;
    }
    
}