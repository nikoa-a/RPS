import java.util.Scanner;

import game.*;
import game.implementation.*;
import input.Input;
import input.implementation.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        Game game = selectGame(scan);
        Input input = selectPlayers(scan, game);

        while (game.running()) {
            String player1 = input.player1Input();
            String player2 = input.player2Input();

            System.out.println(player1);
            System.out.println(player2);
         
            game.play(player1, player2);
            game.score();
        }
    }

    
    private static Game selectGame(Scanner scan) {
        while (true) {
            System.out.println("1=RPS");
            System.out.println("2=RPSSL");
            System.out.print("Valitse pelimuoto: ");
            try {
                int mode = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (mode == 1) {
                    return new RPSGame();
                } else if (mode == 2) {
                    return new RPSSLGame();
                }
            } catch (Exception e) {
                System.out.println();
            }
        }
    }

    private static Input selectPlayers(Scanner scan, Game game) {
        while (true) {
            System.out.println("1=CPU vs CPU");
            System.out.println("2=Pelaaja vs CPU");
            System.out.println("3=Pelaaja vs Pelaaja");
            System.out.print("Valitse pelaajat: ");
            try {
                int mode = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (mode == 1) {
                    return new AutoInput(game.getValidOptions());
                } else if (mode == 2) {
                    return new VersusBotInput(game.getValidOptions(), scan);
                } else if (mode == 3) {
                    return new VersusPlayerInput(game.getValidOptions(), scan);
                } 
            } catch (Exception e) {
                System.out.println();
            }
        }
    }

}
