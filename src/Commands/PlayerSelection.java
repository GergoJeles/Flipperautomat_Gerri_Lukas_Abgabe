package Commands;

import java.util.Random;

public class PlayerSelection implements Command{
    private static final Random rndPlayer = new Random();

    @Override
    public void execute(){
        int players = getRandomPlayer(1, 3);
        System.out.printf("Spieler " + players + "ist am Zug.");
    }

    private int getRandomPlayer(int min, int max){
        return rndPlayer.nextInt(max - min + 1) + min;
    }
}
