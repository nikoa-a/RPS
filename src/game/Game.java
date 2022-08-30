package game;

public abstract class Game {

    int player1Points;
    int player2Points;

    public Game() {
        player1Points = 0;
        player2Points = 0;
    }

    public abstract void play(String player1, String player2);

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
