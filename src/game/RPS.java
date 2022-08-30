package game;

public class RPS extends Game {

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
        int player1Int = optionToInt(player1);
        int player2Int = optionToInt(player2);
        
        int diff = player1Int - player2Int;
        if (diff < 0) {
            diff += 3;
        }
        return diff;
    }

    private int optionToInt(String option) {
        if (option.equals("kivi")) {
            return 1;
        } else if(option.equals("paperi")) {
            return 2;
        } else if(option.equals("sakset")) {
            return 3;
        }
        return 0;
    }
    
}
