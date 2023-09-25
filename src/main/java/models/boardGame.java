package models;

import enums.gameComplexity;
import enums.gameType;

public class boardGame {
    private String name;
    private gameType type;
    private int minPlayers;
    private int maxPlayers;
    private int playingTime;
    private gameComplexity complexity;

    public String toString() {
        return "Name: " + name + "\nType: " + type +
                "\nMin Players: " + minPlayers + "\nMax Players: " + maxPlayers +
                "\nPlaying Time: " + playingTime + " minutes" + "\nComplexity: " + complexity +
                "\nOnline Play: Yes\nOnsite Play: Yes";
    }
}
