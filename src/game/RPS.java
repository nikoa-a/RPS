package game;

public class RPS {

    int player1Points;
    int player2Points;

    public RPS() {
        player1Points = 0;
        player2Points = 0;
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

    public void score() {
        System.out.println("-------");
        System.out.println("Player 1: " + player1Points);
        System.out.println("Player 2: " + player2Points);
        System.out.println();
    }

    public boolean running() {
        if (player1Points < 2 && player2Points < 2) {
            return true;
        }
        if (player1Points < player2Points) {
            System.out.println("Player 2 won!");
        } else {
            System.out.println("Player 1 won!");
        }
        return false;
    }
    
}
