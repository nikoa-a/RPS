package input;

import input.objects.Player;

public abstract class Input {

    protected Player player1;
    protected Player player2;

    public String player1Input() {
        return player1.option();
    }

    public String player2Input() {
        return player2.option();
    }
    
}
