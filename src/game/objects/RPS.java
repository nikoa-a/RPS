package game.objects;

import game.Options;

public class RPS implements Options {

    public int optionNumber(String option) {
        if (option.equals("kivi")) {
            return 1;
        } else if(option.equals("paperi")) {
            return 2;
        } else if(option.equals("sakset")) {
            return 3;
        }
        return 0;
    }

    public int getNumberOfOptions() {
        return 3;
    }
    
}
